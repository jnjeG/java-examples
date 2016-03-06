package spring.orm.hibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.jdbc.common.bean.UrUser;
import spring.jdbc.common.dao.UrUserDao;
import spring.orm.hibernate.common.dao.ProductDao;

import java.util.Collection;

/**
 * Created by chenjunjie on 16/3/5.
 */
public class XTest {
    public static void main(String[] args) {
        JdbcTemplateTest();
    }

    public static void JdbcTemplateTest(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:spring/orm/hibernate/common/resources/HibernateOrmApplicationContext.xml");
        ProductDao  myProductDao = (ProductDao )context2.getBean("myProductDao");
        Collection mobile = myProductDao.loadProductsByCategory("mobile");
        System.out.println(mobile);
    }

}
