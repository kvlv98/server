package ru.flowers.flowers.entity;

import javax.persistence.*;

@Entity
@Table(name = "cus")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "city")
    private String city;
    @Column(name = "address")
    private String address;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="flowerid")
    private Flower flower;

    public Order() {
    }

    public Order(int id, String email, String name, String phone, String city, String address) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.address = address;
    }

    public Order(String email, String name, String phone, String city, String address) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

}
