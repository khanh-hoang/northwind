package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.OrdersTaxStatus;
import fi.vamk.e2001365.northwind.repository.OrdersTaxStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrdersTaxStatusService {
    @Autowired
    private OrdersTaxStatusRepository OrdersTaxStatusRepository;

    public ResponseEntity<Iterable<OrdersTaxStatus>> getAllOrdersTaxStatus(){
        return ResponseEntity.ok(OrdersTaxStatusRepository.findAll());
    }

    public ResponseEntity<OrdersTaxStatus> getOrdersTaxStatus(Integer id) {
        if (OrdersTaxStatusRepository.existsById(id))
            return ResponseEntity.ok(OrdersTaxStatusRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<OrdersTaxStatus> postOrdersTaxStatus(OrdersTaxStatus ordersTaxStatus){
        if (OrdersTaxStatusRepository.existsById(ordersTaxStatus.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(OrdersTaxStatusRepository.save(ordersTaxStatus));
    }

    public ResponseEntity<OrdersTaxStatus> updateOrdersTaxStatus(Integer id, OrdersTaxStatus ordersTaxStatus){
        ordersTaxStatus.setId(id);
        if (OrdersTaxStatusRepository.existsById(id))
            return ResponseEntity.ok(OrdersTaxStatusRepository.save(ordersTaxStatus));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteOrdersTaxStatus(Integer id){
        if (OrdersTaxStatusRepository.existsById(id)){
            OrdersTaxStatusRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
