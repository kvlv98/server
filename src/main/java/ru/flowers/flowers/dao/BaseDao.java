package ru.flowers.flowers.dao;

import org.hibernate.Session;
import ru.flowers.flowers.utils.HibernateUtils;

public class BaseDao {

    protected Session getSession() {
        return HibernateUtils.getSessionFactory().openSession();
    }

}
