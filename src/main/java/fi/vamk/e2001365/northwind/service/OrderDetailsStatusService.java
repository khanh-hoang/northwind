package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.OrderDetailsStatus;
import fi.vamk.e2001365.northwind.repository.OrderDetailsStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsStatusService {
    @Autowired
    private OrderDetailsStatusRepository OrderDetailsStatusRepository;

    public ResponseEntity<Iterable<OrderDetailsStatus>> getAllOrderDetailsStatus(){
        return ResponseEntity.ok(OrderDetailsStatusRepository.findAll());
    }

    public ResponseEntity<OrderDetailsStatus> getOrderDetailsStatus(Integer id) {
        if (OrderDetailsStatusRepository.existsById(id))
            return ResponseEntity.ok(OrderDetailsStatusRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<OrderDetailsStatus> postOrderDetailsStatus(OrderDetailsStatus orderDetailsStatus){
        if (OrderDetailsStatusRepository.existsById(orderDetailsStatus.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(OrderDetailsStatusRepository.save(orderDetailsStatus));
    }

    public ResponseEntity<OrderDetailsStatus> updateOrderDetailsStatus(Integer id, OrderDetailsStatus orderDetailsStatus){
        orderDetailsStatus.setId(id);
        if (OrderDetailsStatusRepository.existsById(id))
            return ResponseEntity.ok(OrderDetailsStatusRepository.save(orderDetailsStatus));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteOrderDetailsStatus(Integer id){
        if (OrderDetailsStatusRepository.existsById(id)){
            OrderDetailsStatusRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
