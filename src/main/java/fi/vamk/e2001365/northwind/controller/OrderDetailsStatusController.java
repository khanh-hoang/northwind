package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.OrderDetailsStatus;
import fi.vamk.e2001365.northwind.service.OrderDetailsStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/details/status")
public class OrderDetailsStatusController {
    @Autowired
    private OrderDetailsStatusService OrderDetailsStatusService;

    @GetMapping("")
    public ResponseEntity<Iterable<OrderDetailsStatus>> getAllOrderDetailsStatus(){
        return OrderDetailsStatusService.getAllOrderDetailsStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetailsStatus> getOrderDetailsStatus(@PathVariable("id") Integer id){
        return OrderDetailsStatusService.getOrderDetailsStatus(id);
    }

    @PostMapping("")
    public ResponseEntity<OrderDetailsStatus> postOrderDetailsStatus(@RequestBody OrderDetailsStatus orderDetailsStatus){
        return OrderDetailsStatusService.postOrderDetailsStatus(orderDetailsStatus);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetailsStatus> updateOrderDetailsStatus(@RequestBody OrderDetailsStatus orderDetailsStatus, @PathVariable("id") Integer id){
        return OrderDetailsStatusService.updateOrderDetailsStatus(id, orderDetailsStatus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrderDetailsStatus> deleteOrderDetailsStatus(@PathVariable("id") Integer id){
        return OrderDetailsStatusService.deleteOrderDetailsStatus(id);
    }
}
