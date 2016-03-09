package spring.orm.hibernate.common.service;

import java.util.Collection;

/**
 * Created by chenjunjie on 16/2/24.
 */
public interface ProductService {
    Collection loadProductsByCategory(String category);
}
