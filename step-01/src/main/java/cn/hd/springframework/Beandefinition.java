package cn.hd.springframework;

/**
 * @author : YeHaiD
 * @Date 2023-05-06 14:14
 * @Description:
 */
public class Beandefinition {
    private Object bean;
    public Beandefinition(Object bean) {
        this.bean = bean;
    }
    public Object getBean() {
        return bean;
    }

}
