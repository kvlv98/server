package ru.flowers.flowers.constroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.flowers.flowers.entity.Flower;
import ru.flowers.flowers.entity.Order;
import ru.flowers.flowers.service.FlowersService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class FlowersEndpoint {

    private final FlowersService service;

    @Autowired
    public FlowersEndpoint(FlowersService service) {
        this.service = service;
    }

    @PostMapping(value = "/flower", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
    public Flower addFlower(@RequestBody Flower flower) {
        return service.save(flower);
    }

    @GetMapping(value = "/flowers", produces = APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
    public List<Flower> getAllFlowers() {
        return service.getAllFlowers();
    }

    @GetMapping(value = "/flower/{id}", produces = APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
    public Flower getFlower(@PathVariable("id") int id) {
        return service.getFlowerById(id);
    }

    @GetMapping(value = "/orders", produces = APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
    public List<Order> getOrders() {
        return service.getOrders();
    }

    @PostMapping(value = "/order/{id}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
    public Order addOrder(@RequestBody Order order, @PathVariable(value = "id") int id) {
        return service.addOrder(order, id);
    }



}
