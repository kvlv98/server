package ru.flowers.flowers.service;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flowers.flowers.dao.BaseDao;
import ru.flowers.flowers.entity.Flower;
import ru.flowers.flowers.entity.Order;

import java.util.List;

@Service
@Transactional
public class FlowersService extends BaseDao {

    public Flower save(Flower flower) {
        try (Session session = getSession()) {
            session.beginTransaction();
            session.save(flower);
            session.flush();
            return flower;
        }
    }

    public List<Flower> getAllFlowers() {
        try (Session session = getSession()) {
            return session.createQuery("FROM Flower").list();
        }
    }

    public Flower getFlowerById(int id) {
        try (Session session = getSession()) {
            return session.get(Flower.class, id);
        }
    }

    public Order addOrder(Order order, int id) {
        try (Session session = getSession()) {
            Flower flower = session.load(Flower.class, id);
            order.setFlower(flower);
            session.beginTransaction();
            session.save(order);
            session.flush();
            return order;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List<Order> getOrders() {
        try (Session session = getSession()) {
            return session.createQuery("FROM Order").list();
        }
    }
}
