package springframework.entity;

/**
 * 注入类型为引用的定义
 *
 * Created by xieli on 2021/3/10.
 */
public class BeanReference {

    private String name;
    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
