package org.example.bean.factory.config;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 10:29
 * @Description:
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
