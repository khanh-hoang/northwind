package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderStatus;
import fi.vamk.e2001365.northwind.service.PurchaseOrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase/order/status")
public class PurchaseOrderStatusController {
    @Autowired
    private PurchaseOrderStatusService PurchaseOrderStatusService;

    @GetMapping("")
    public ResponseEntity<Iterable<PurchaseOrderStatus>> getAllPurchaseOrderStatus(){
        return PurchaseOrderStatusService.getAllPurchaseOrderStatus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderStatus> getPurchaseOrderStatus(@PathVariable("id") Integer id){
        return PurchaseOrderStatusService.getPurchaseOrderStatus(id);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrderStatus> postPurchaseOrderStatus(@RequestBody PurchaseOrderStatus purchaseOrderStatus){
        return PurchaseOrderStatusService.postPurchaseOrderStatus(purchaseOrderStatus);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrderStatus> updatePurchaseOrderStatus(@RequestBody PurchaseOrderStatus purchaseOrderStatus, @PathVariable("id") Integer id){
        return PurchaseOrderStatusService.updatePurchaseOrderStatus(id, purchaseOrderStatus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PurchaseOrderStatus> deletePurchaseOrderStatus(@PathVariable("id") Integer id){
        return PurchaseOrderStatusService.deletePurchaseOrderStatus(id);
    }
}
