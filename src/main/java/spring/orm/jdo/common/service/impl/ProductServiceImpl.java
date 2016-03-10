package spring.orm.jdo.common.service.impl;


import spring.orm.jdo.common.dao.ProductDao;
import spring.orm.jdo.common.service.ProductService;

import java.util.Collection;

/**
 * Created by chenjunjie on 16/2/24.
 */
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Collection loadProductsByCategory(String category){
        return  productDao.loadProductsByCategory(category);
    }
}
