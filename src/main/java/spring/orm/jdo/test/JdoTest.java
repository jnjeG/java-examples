package spring.orm.jdo.test;

import org.expl.annotation.NotFinishedTest;
import org.expl.annotation.SearchTag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.orm.jdo.common.service.ProductService;

import java.util.Collection;

@SearchTag(
{
"spring-Hibernate",
"spring-ORM",
"事务"
}
)
@NotFinishedTest(reason = "配置项未完善，导致启动失败")
public class JdoTest {
    public static void main(String[] args) {
        hibernateOrmTest();
    }

    public static void hibernateOrmTest(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:spring/orm/jdo/common/resources/JdoTestApplicationContext.xml");
        ProductService pDao = (ProductService)context2.getBean("myProductService");
        Collection mobile = pDao.loadProductsByCategory("mobile");
        System.out.println(mobile);
    }

}
