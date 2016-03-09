package spring.orm.hibernate.common.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.orm.hibernate.common.dao.ProductDao;

import java.util.Collection;

@Repository
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Collection loadProductsByCategory(String category) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("from spring.orm.hibernate.common.bean.Product product where product.category=?")
                .setParameter(0, category)
                .list();
    }
}
