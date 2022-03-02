package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.OrderDetail;
import fi.vamk.e2001365.northwind.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository OrderDetailRepository;

    public ResponseEntity<Iterable<OrderDetail>> getAllOrderDetail(){
        return ResponseEntity.ok(OrderDetailRepository.findAll());
    }

    public ResponseEntity<OrderDetail> getOrderDetail(Integer id) {
        if (OrderDetailRepository.existsById(id))
            return ResponseEntity.ok(OrderDetailRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<OrderDetail> postOrderDetail(OrderDetail orderDetail){
        if (OrderDetailRepository.existsById(orderDetail.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(OrderDetailRepository.save(orderDetail));
    }

    public ResponseEntity<OrderDetail> updateOrderDetail(Integer id, OrderDetail orderDetail){
        orderDetail.setId(id);
        if (OrderDetailRepository.existsById(id))
            return ResponseEntity.ok(OrderDetailRepository.save(orderDetail));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteOrderDetail(Integer id){
        if (OrderDetailRepository.existsById(id)){
            OrderDetailRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
