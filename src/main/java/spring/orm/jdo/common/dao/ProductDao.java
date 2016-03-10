package spring.orm.jdo.common.dao;

import java.util.Collection;

/**
 * Created by chenjunjie on 16/2/24.
 */
public interface ProductDao {
    Collection loadProductsByCategory(String category);
}
