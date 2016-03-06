package spring.orm.hibernate.peculiar.xTest.dao.impl;

import spring.jdbc.common.bean.UrUser;
import spring.jdbc.common.dao.UrUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class XDaoImpl implements UrUserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public List<UrUser> getUrUser(UrUser so) {
        return null;
    }

    public int updateUrUser(UrUser uo) {
        return 0;
    }

    public void insertUrUser(UrUser io) {
        this.jdbcTemplate.update("INSERT INTO ur_user(`user_id`,`sex`,`nickname`,`qq_no`,`wx_no`,`email`,`password`)" +
                " VALUES (?,?,?,?,?,?,?)",io.getUserId(),io.getSex(),io.getNickname(),io.getQqNo(),io.getWxNo(),io.getEmail(),io.getPassword());
    }

    public void deleteUrUser(UrUser delObj) {

    }
}
