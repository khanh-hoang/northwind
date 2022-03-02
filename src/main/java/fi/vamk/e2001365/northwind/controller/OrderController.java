package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Order;
import fi.vamk.e2001365.northwind.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService OrderService;

    @GetMapping("")
    public ResponseEntity<Iterable<Order>> getAllOrder(){
        return OrderService.getAllOrder();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable("id") Integer id){
        return OrderService.getOrder(id);
    }

    @PostMapping("")
    public ResponseEntity<Order> postOrder(@RequestBody Order order){
        return OrderService.postOrder(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("id") Integer id){
        return OrderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable("id") Integer id){
        return OrderService.deleteOrder(id);
    }
}
