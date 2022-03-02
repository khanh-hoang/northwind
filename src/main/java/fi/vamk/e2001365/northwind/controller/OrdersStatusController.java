package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.OrdersStatus;
import fi.vamk.e2001365.northwind.service.OrdersStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders/status")
public class OrdersStatusController {
    @Autowired
    private OrdersStatusService OrdersStatusService;

    @GetMapping("")
    public ResponseEntity<Iterable<OrdersStatus>> getAllOrdersStatus(){
        return OrdersStatusService.getAllOrdersStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdersStatus> getOrdersStatus(@PathVariable("id") Integer id){
        return OrdersStatusService.getOrdersStatus(id);
    }

    @PostMapping("")
    public ResponseEntity<OrdersStatus> postOrdersStatus(@RequestBody OrdersStatus ordersStatus){
        return OrdersStatusService.postOrdersStatus(ordersStatus);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdersStatus> updateOrdersStatus(@RequestBody OrdersStatus ordersStatus, @PathVariable("id") Integer id){
        return OrdersStatusService.updateOrdersStatus(id, ordersStatus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrdersStatus> deleteOrdersStatus(@PathVariable("id") Integer id){
        return OrdersStatusService.deleteOrdersStatus(id);
    }
}
