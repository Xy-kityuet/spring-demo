package cn.hd.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : YeHaiD
 * @Date 2023-05-06 14:31
 * @Description:
 */
public class BeanFactory {
    private Map<String,Beandefinition> beandefinitionMap =  new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return  beandefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,Beandefinition definition){
        beandefinitionMap.put(name, definition);
    }
}
