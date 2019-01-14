package ru.flowers.flowers.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "flower")
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private BigDecimal price;
    private String url;
    private String color;
    private String description;
    @OneToMany(cascade =  CascadeType.ALL , mappedBy="flower", fetch = FetchType.EAGER)
    private List<Order> orders;

    public Flower() {
    }

    public Flower(int id, String name, BigDecimal price, String url, String color, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.color = color;
        this.description = description;
    }

    public Flower(String name, BigDecimal price, String url, String color, String description) {
        this.name = name;
        this.price = price;
        this.url = url;
        this.color = color;
        this.description = description;
    }

    public Flower(String name, BigDecimal price, String url, String color, String description, List<Order> orders) {
        this.name = name;
        this.price = price;
        this.url = url;
        this.color = color;
        this.description = description;
        this.orders = orders;
    }

    public Flower(int id, String name, BigDecimal price, String url, String color, String description, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.color = color;
        this.description = description;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
