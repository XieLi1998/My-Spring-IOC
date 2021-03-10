package springframework.factory;

import springframework.entity.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xieli on 2021/3/10.
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) throws Exception {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) return null;
        if (!beanDefinition.isSingleton() || beanDefinition.getBean() == null) {
            return doCreateBean(beanDefinition);
        } else {
            return doCreateBean(beanDefinition);
        }
    }

    @Override
    public Object getBean(Class clazz) throws Exception {
        BeanDefinition beanDefinition = null;
        for (Map.Entry<String, BeanDefinition> entry : beanDefinitionMap.entrySet()) {
            Class tmpClass = entry.getValue().getBeanClass();
            if (tmpClass == clazz || clazz.isAssignableFrom(tmpClass)) {
                beanDefinition = entry.getValue();
            }
        }
        if (beanDefinition == null) {
            return null;
        }
        if (!beanDefinition.isSingleton() || beanDefinition.getBean() == null) {
            return doCreateBean(beanDefinition);
        } else {
            return beanDefinition.getBean();
        }
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        beanDefinitionMap.put(name, beanDefinition);
    }

    /**
     * 创建Bean实例
     *
     * @param beanDefinition Bean定义对象
     * @return Bean实例对象
     * @throws Exception
     */
    abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;

    public void populateBeans() throws Exception {
        for(Map.Entry<String, BeanDefinition> entry : beanDefinitionMap.entrySet()) {
            doCreateBean(entry.getValue());
        }
    }

}
