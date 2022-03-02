package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderDetail;
import fi.vamk.e2001365.northwind.repository.PurchaseOrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderDetailService {
    @Autowired
    private PurchaseOrderDetailRepository PurchaseOrderDetailRepository;

    public ResponseEntity<Iterable<PurchaseOrderDetail>> getAllPurchaseOrderDetail(){
        return ResponseEntity.ok(PurchaseOrderDetailRepository.findAll());
    }

    public ResponseEntity<PurchaseOrderDetail> getPurchaseOrderDetail(Integer id) {
        if (PurchaseOrderDetailRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderDetailRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<PurchaseOrderDetail> postPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail){
        if (PurchaseOrderDetailRepository.existsById(purchaseOrderDetail.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(PurchaseOrderDetailRepository.save(purchaseOrderDetail));
    }

    public ResponseEntity<PurchaseOrderDetail> updatePurchaseOrderDetail(Integer id, PurchaseOrderDetail purchaseOrderDetail){
        purchaseOrderDetail.setId(id);
        if (PurchaseOrderDetailRepository.existsById(id))
            return ResponseEntity.ok(PurchaseOrderDetailRepository.save(purchaseOrderDetail));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deletePurchaseOrderDetail(Integer id){
        if (PurchaseOrderDetailRepository.existsById(id)){
            PurchaseOrderDetailRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
