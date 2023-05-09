package org.example.bean.factory.support;

import org.example.BeansException;
import org.example.BeansException;
import org.example.bean.factory.config.BeanDefinition;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 11:11
 * @Description:
 */
public abstract class AbstractAutowireCapableBeanFactory  extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition){
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException |IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName,bean);
        return bean;
    }
}
