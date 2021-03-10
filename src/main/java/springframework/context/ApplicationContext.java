package springframework.context;

/**
 * 应用程序上下文接口
 *
 * Created by xieli on 2021/3/10.
 */
public interface ApplicationContext {

    Object getBean(Class clazz) throws Exception;

    Object getBean(String beanName) throws Exception;

}
