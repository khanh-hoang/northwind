package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderStatus;
import fi.vamk.e2001365.northwind.repository.PurchaseOrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderStatusService {
    @Autowired
    private PurchaseOrderStatusRepository PurchaseOrderStatusRepository;

    public ResponseEntity<Iterable<PurchaseOrderStatus>> getAllPurchaseOrderStatus(){
        return ResponseEntity.ok(PurchaseOrderStatusRepository.findAll());
    }

    public ResponseEntity<PurchaseOrderStatus> getPurchaseOrderStatus(Integer id) {
        if (PurchaseOrderStatusRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderStatusRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<PurchaseOrderStatus> postPurchaseOrderStatus(PurchaseOrderStatus purchaseOrderStatus){
        if (PurchaseOrderStatusRepository.existsById(purchaseOrderStatus.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(PurchaseOrderStatusRepository.save(purchaseOrderStatus));
    }

    public ResponseEntity<PurchaseOrderStatus> updatePurchaseOrderStatus(Integer id, PurchaseOrderStatus purchaseOrderStatus){
        purchaseOrderStatus.setId(id);
        if (PurchaseOrderStatusRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderStatusRepository.save(purchaseOrderStatus));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deletePurchaseOrderStatus(Integer id){
        if (PurchaseOrderStatusRepository.existsById(id)){
            PurchaseOrderStatusRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
