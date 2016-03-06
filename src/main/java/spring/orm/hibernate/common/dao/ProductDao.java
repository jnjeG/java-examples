package spring.orm.hibernate.common.dao;

import spring.jdbc.common.bean.UrUser;

import java.util.Collection;
import java.util.List;

/**
 * Created by chenjunjie on 16/2/24.
 */
public interface ProductDao {
    Collection loadProductsByCategory(String category);
}
