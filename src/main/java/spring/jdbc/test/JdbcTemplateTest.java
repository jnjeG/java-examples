package spring.jdbc.test;

import spring.jdbc.common.bean.UrUser;
import spring.jdbc.common.dao.UrUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjunjie on 16/2/20.
 */
public class JdbcTemplateTest{
    public static void main(String[] args) {
        JdbcTemplateTest();
    }

    /**
     * 方法命名规范:
     * 要测试的类＋Test
     */

    public static void JdbcTemplateTest(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:spring/jdbc/peculiar/jdbcTemplate/resources/jdbcTemplateApplicationContext.xml");
        UrUserDao urUserDaoImpl = (UrUserDao)context2.getBean("urUserDaoImpl");
        UrUser io = new UrUser();
        io.setUserId("2323-ddd3-232r-232d3");
        io.setSex("f");
        io.setEmail("hao@126.com");
        io.setNickname("blackScreen");
        io.setPassword("123456");
        io.setQqNo("334334433");
        io.setWxNo("yyl123");
        urUserDaoImpl.insertUrUser(io);
    }
}
