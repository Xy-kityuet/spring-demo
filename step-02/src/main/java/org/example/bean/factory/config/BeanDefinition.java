package org.example.bean.factory.config;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 10:25
 * @Description:
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }


}
