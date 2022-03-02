package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Customer;
import fi.vamk.e2001365.northwind.entity.InventoryTransaction;
import fi.vamk.e2001365.northwind.repository.CustomerRepository;
import fi.vamk.e2001365.northwind.repository.InventoryTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InventoryTransactionService {
    @Autowired
    private InventoryTransactionRepository inventoryTransactionRepository;

    public ResponseEntity<Iterable<InventoryTransaction>> getAllInventoryTransaction() {
        return ResponseEntity.ok(inventoryTransactionRepository.findAll());
    }

    public ResponseEntity<InventoryTransaction> getInventoryTransaction(Integer id) {
        if (inventoryTransactionRepository.existsById(id))
            return ResponseEntity.ok(inventoryTransactionRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<InventoryTransaction> postInventoryTransaction(InventoryTransaction inventoryTransaction) {
        if (inventoryTransactionRepository.existsById(inventoryTransaction.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(inventoryTransactionRepository.save(inventoryTransaction));
    }

    public ResponseEntity<InventoryTransaction> updateInventoryTransaction(Integer id, InventoryTransaction inventoryTransaction) {
        inventoryTransaction.setId(id);
        if (inventoryTransactionRepository.existsById(id))
            return ResponseEntity.ok(inventoryTransactionRepository.save(inventoryTransaction));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteInventoryTransaction(Integer id) {
        if (inventoryTransactionRepository.existsById(id)) {
            inventoryTransactionRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.badRequest().build();
    }
}