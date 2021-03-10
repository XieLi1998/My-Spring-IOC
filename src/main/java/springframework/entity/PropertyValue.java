package springframework.entity;

/**
 * 单个键值对，表示注入对象的属性
 *
 * Created by xieli on 2021/3/10.
 */
public class PropertyValue {

    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
