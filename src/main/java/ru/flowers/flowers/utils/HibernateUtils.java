package ru.flowers.flowers.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.flowers.flowers.entity.Flower;
import ru.flowers.flowers.entity.Order;

public class HibernateUtils {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    public static SessionFactory buildSessionFactory() {
        try {
            Configuration conf = new Configuration();
            conf.addAnnotatedClass(Flower.class);
            conf.addAnnotatedClass(Order.class);
            return conf.configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
