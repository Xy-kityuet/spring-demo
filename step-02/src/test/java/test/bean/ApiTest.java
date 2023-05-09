package test.bean;

import org.example.bean.factory.config.BeanDefinition;
import org.example.bean.factory.support.BeanDefinitionRegistry;
import org.example.bean.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 16:15
 * @Description:
 */
public class ApiTest {


    @Test
    public void test_BeanFactory() {

        //初始化BeanFactory作为容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_single =(UserService) beanFactory.getSingleton("userService");
        userService_single.queryUserInfo();


    }
}
