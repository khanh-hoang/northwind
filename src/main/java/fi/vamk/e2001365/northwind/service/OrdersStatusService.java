package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.OrdersStatus;
import fi.vamk.e2001365.northwind.repository.OrdersStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrdersStatusService {
    @Autowired
    private OrdersStatusRepository OrdersStatusRepository;

    public ResponseEntity<Iterable<OrdersStatus>> getAllOrdersStatus(){
        return ResponseEntity.ok(OrdersStatusRepository.findAll());
    }

    public ResponseEntity<OrdersStatus> getOrdersStatus(Integer id) {
        if (OrdersStatusRepository.existsById(id))
            return ResponseEntity.ok(OrdersStatusRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<OrdersStatus> postOrdersStatus(OrdersStatus ordersStatus){
        if (OrdersStatusRepository.existsById(ordersStatus.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(OrdersStatusRepository.save(ordersStatus));
    }

    public ResponseEntity<OrdersStatus> updateOrdersStatus(Integer id, OrdersStatus ordersStatus){
        ordersStatus.setId(id);
        if (OrdersStatusRepository.existsById(id))
            return ResponseEntity.ok(OrdersStatusRepository.save(ordersStatus));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteOrdersStatus(Integer id){
        if (OrdersStatusRepository.existsById(id)){
            OrdersStatusRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
