package org.example.bean.factory.support;

import org.example.bean.factory.config.BeanDefinition;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 11:21
 * @Description:
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
