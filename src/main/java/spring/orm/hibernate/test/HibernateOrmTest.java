package spring.orm.hibernate.test;

import org.javaexamples.SearchTag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.orm.hibernate.common.service.ProductService;

import java.util.Collection;

@SearchTag(
{
"spring-Hibernate",
"spring-ORM",
"事务"
}
)
public class HibernateOrmTest {
    public static void main(String[] args) {
        hibernateOrmTest();
    }

    public static void hibernateOrmTest(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:spring/orm/hibernate/common/resources/HibernateOrmApplicationContext.xml");
        ProductService pService = (ProductService)context2.getBean("productService");
        Collection mobile = pService.loadProductsByCategory("mobile");
        System.out.println(mobile);
    }

}
