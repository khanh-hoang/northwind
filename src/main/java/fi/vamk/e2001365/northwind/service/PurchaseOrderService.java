package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.PurchaseOrder;
import fi.vamk.e2001365.northwind.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderRepository PurchaseOrderRepository;

    public ResponseEntity<Iterable<PurchaseOrder>> getAllPurchaseOrder(){
        return ResponseEntity.ok(PurchaseOrderRepository.findAll());
    }

    public ResponseEntity<PurchaseOrder> getPurchaseOrder(Integer id) {
        if (PurchaseOrderRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<PurchaseOrder> postPurchaseOrder(PurchaseOrder purchaseOrder){
        if (PurchaseOrderRepository.existsById(purchaseOrder.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(PurchaseOrderRepository.save(purchaseOrder));
    }

    public ResponseEntity<PurchaseOrder> updatePurchaseOrder(Integer id, PurchaseOrder purchaseOrder){
        purchaseOrder.setId(id);
        if (PurchaseOrderRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderRepository.save(purchaseOrder));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deletePurchaseOrder(Integer id){
        if (PurchaseOrderRepository.existsById(id)){
            PurchaseOrderRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
