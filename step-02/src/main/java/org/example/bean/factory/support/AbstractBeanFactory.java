package org.example.bean.factory.support;

import org.example.bean.factory.BeanFactory;
import org.example.bean.factory.config.BeanDefinition;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 10:51
 * @Description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if(bean!=null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName)  ;

    protected abstract Object createBean(String name,BeanDefinition beanDefinition);
}
