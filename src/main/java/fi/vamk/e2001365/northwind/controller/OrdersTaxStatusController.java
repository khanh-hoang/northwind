package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.OrdersTaxStatus;
import fi.vamk.e2001365.northwind.service.OrdersTaxStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders/tax/status")
public class OrdersTaxStatusController {
    @Autowired
    private OrdersTaxStatusService OrdersTaxStatusService;

    @GetMapping("")
    public ResponseEntity<Iterable<OrdersTaxStatus>> getAllOrdersTaxStatus(){
        return OrdersTaxStatusService.getAllOrdersTaxStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdersTaxStatus> getOrdersTaxStatus(@PathVariable("id") Integer id){
        return OrdersTaxStatusService.getOrdersTaxStatus(id);
    }

    @PostMapping("")
    public ResponseEntity<OrdersTaxStatus> postOrdersTaxStatus(@RequestBody OrdersTaxStatus ordersTaxStatus){
        return OrdersTaxStatusService.postOrdersTaxStatus(ordersTaxStatus);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdersTaxStatus> updateOrdersTaxStatus(@RequestBody OrdersTaxStatus ordersTaxStatus, @PathVariable("id") Integer id){
        return OrdersTaxStatusService.updateOrdersTaxStatus(id, ordersTaxStatus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrdersTaxStatus> deleteOrdersTaxStatus(@PathVariable("id") Integer id){
        return OrdersTaxStatusService.deleteOrdersTaxStatus(id);
    }
}
