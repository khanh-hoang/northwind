package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Order;
import fi.vamk.e2001365.northwind.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public ResponseEntity<Iterable<Order>> getAllOrder(){
        return ResponseEntity.ok(orderRepository.findAll());
    }

    public ResponseEntity<Order> getOrder(Integer id) {
        if (orderRepository.existsById(id))
            return ResponseEntity.ok(orderRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Order> postOrder(Order order){
        if (orderRepository.existsById(order.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(orderRepository.save(order));
    }

    public ResponseEntity<Order> updateOrder(Integer id, Order order){
        order.setId(id);
        if (orderRepository.existsById(id))
            return ResponseEntity.ok(orderRepository.save(order));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteOrder(Integer id){
        if (orderRepository.existsById(id)){
            orderRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
