package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.InventoryTransactionType;
import fi.vamk.e2001365.northwind.repository.InventoryTransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InventoryTransactionTypeService {
    @Autowired
    private InventoryTransactionTypeRepository inventoryTransactionTypeRepository;

    public ResponseEntity<Iterable<InventoryTransactionType>> getAllInventoryTransactionType() {
        return ResponseEntity.ok(inventoryTransactionTypeRepository.findAll());
    }

    public ResponseEntity<InventoryTransactionType> getInventoryTransactionType(Integer id) {
        if (inventoryTransactionTypeRepository.existsById(id))
            return ResponseEntity.ok(inventoryTransactionTypeRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<InventoryTransactionType> postInventoryTransactionType(InventoryTransactionType inventoryTransactionType) {
        if (inventoryTransactionTypeRepository.existsById(inventoryTransactionType.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(inventoryTransactionTypeRepository.save(inventoryTransactionType));
    }

    public ResponseEntity<InventoryTransactionType> updateInventoryTransactionType(Integer id, InventoryTransactionType inventoryTransactionType) {
        inventoryTransactionType.setId(id);
        if (inventoryTransactionTypeRepository.existsById(id))
            return ResponseEntity.ok(inventoryTransactionTypeRepository.save(inventoryTransactionType));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteInventoryTransactionType(Integer id) {
        if (inventoryTransactionTypeRepository.existsById(id)) {
            inventoryTransactionTypeRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.badRequest().build();
    }
}