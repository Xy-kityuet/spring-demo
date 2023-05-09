package org.example.bean.factory.support;

import org.example.BeansException;
import org.example.bean.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 11:26
 * @Description:
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition ==null){
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }


    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
