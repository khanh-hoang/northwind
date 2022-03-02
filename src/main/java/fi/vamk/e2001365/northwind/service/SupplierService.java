package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Supplier;
import fi.vamk.e2001365.northwind.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository SupplierRepository;

    public ResponseEntity<Iterable<Supplier>> getAllSupplier(){
        return ResponseEntity.ok(SupplierRepository.findAll());
    }

    public ResponseEntity<Supplier> getSupplier(Integer id) {
        if (SupplierRepository.existsById(id))
            return ResponseEntity.ok(SupplierRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Supplier> postSupplier(Supplier supplier){
        if (SupplierRepository.existsById(supplier.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(SupplierRepository.save(supplier));
    }

    public ResponseEntity<Supplier> updateSupplier(Integer id, Supplier supplier){
        supplier.setId(id);
        if (SupplierRepository.existsById(id))
            return ResponseEntity.ok(SupplierRepository.save(supplier));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteSupplier(Integer id){
        if (SupplierRepository.existsById(id)){
            SupplierRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
