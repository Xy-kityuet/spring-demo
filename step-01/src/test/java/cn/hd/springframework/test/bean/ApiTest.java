package cn.hd.springframework.test.bean;

import cn.hd.springframework.BeanFactory;
import cn.hd.springframework.Beandefinition;
import org.junit.Test;

/**
 * @author : YeHaiD
 * @Date 2023-05-06 15:22
 * @Description:
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化
        BeanFactory beanFactory = new BeanFactory();

        //注入Bean
        Beandefinition beandefinition = new Beandefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beandefinition);

        //获取Bean

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();


    }
}
