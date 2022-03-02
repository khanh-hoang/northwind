package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.PurchaseOrder;
import fi.vamk.e2001365.northwind.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase/order")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService PurchaseOrderService;

    @GetMapping("")
    public ResponseEntity<Iterable<PurchaseOrder>> getAllPurchaseOrder(){
        return PurchaseOrderService.getAllPurchaseOrder();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrder> getPurchaseOrder(@PathVariable("id") Integer id){
        return PurchaseOrderService.getPurchaseOrder(id);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrder> postPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        return PurchaseOrderService.postPurchaseOrder(purchaseOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrder> updatePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder, @PathVariable("id") Integer id){
        return PurchaseOrderService.updatePurchaseOrder(id, purchaseOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PurchaseOrder> deletePurchaseOrder(@PathVariable("id") Integer id){
        return PurchaseOrderService.deletePurchaseOrder(id);
    }
}
