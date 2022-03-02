package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.OrderDetail;
import fi.vamk.e2001365.northwind.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/detail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService OrderDetailService;

    @GetMapping("")
    public ResponseEntity<Iterable<OrderDetail>> getAllOrderDetail(){
        return OrderDetailService.getAllOrderDetail();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetail> getOrderDetail(@PathVariable("id") Integer id){
        return OrderDetailService.getOrderDetail(id);
    }

    @PostMapping("")
    public ResponseEntity<OrderDetail> postOrderDetail(@RequestBody OrderDetail orderDetail){
        return OrderDetailService.postOrderDetail(orderDetail);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetail> updateOrderDetail(@RequestBody OrderDetail orderDetail, @PathVariable("id") Integer id){
        return OrderDetailService.updateOrderDetail(id, orderDetail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrderDetail> deleteOrderDetail(@PathVariable("id") Integer id){
        return OrderDetailService.deleteOrderDetail(id);
    }
}
