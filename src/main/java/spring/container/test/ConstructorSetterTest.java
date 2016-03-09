package spring.container.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.container.peculiar.ConstructorSetterDITest.bean.Car;
import spring.jdbc.common.dao.UrUserDao;

/**
 * 当设值注入与构造注入同时存在时，先执行设置注入，在执行构造注入。
 *
 */
public class ConstructorSetterTest {
    public static void main(String[] args) {
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:spring/container/peculiar/ConstructorSetterDITest/resources/ConstructorSetterApplicationContext.xml");
        Car car = (Car)context2.getBean("car");
    }
}
