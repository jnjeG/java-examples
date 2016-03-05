package spring.jdbc.common.dao;

import spring.jdbc.common.bean.UrUser;

import java.util.List;

/**
 * Created by chenjunjie on 16/2/24.
 */
public interface UrUserDao {
    public List<UrUser> getUrUser(UrUser so);
    public int updateUrUser(UrUser uo);
    public void insertUrUser(UrUser io);
    public void deleteUrUser(UrUser delObj);

}
