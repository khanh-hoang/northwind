package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderDetail;
import fi.vamk.e2001365.northwind.service.PurchaseOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase/order/detail")
public class PurchaseOrderDetailController {
    @Autowired
    private PurchaseOrderDetailService PurchaseOrderDetailService;

    @GetMapping("")
    public ResponseEntity<Iterable<PurchaseOrderDetail>> getAllPurchaseOrderDetail(){
        return PurchaseOrderDetailService.getAllPurchaseOrderDetail();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderDetail> getPurchaseOrderDetail(@PathVariable("id") Integer id){
        return PurchaseOrderDetailService.getPurchaseOrderDetail(id);
    }

    @PostMapping("")
    public ResponseEntity<PurchaseOrderDetail> postPurchaseOrderDetail(@RequestBody PurchaseOrderDetail purchaseOrderDetail){
        return PurchaseOrderDetailService.postPurchaseOrderDetail(purchaseOrderDetail);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrderDetail> updatePurchaseOrderDetail(@RequestBody PurchaseOrderDetail purchaseOrderDetail, @PathVariable("id") Integer id){
        return PurchaseOrderDetailService.updatePurchaseOrderDetail(id, purchaseOrderDetail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PurchaseOrderDetail> deletePurchaseOrderDetail(@PathVariable("id") Integer id){
        return PurchaseOrderDetailService.deletePurchaseOrderDetail(id);
    }
}
