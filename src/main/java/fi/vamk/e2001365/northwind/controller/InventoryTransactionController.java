package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.InventoryTransaction;
import fi.vamk.e2001365.northwind.service.InventoryTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inventory/transaction")
public class InventoryTransactionController {
    @Autowired
    private InventoryTransactionService inventoryTransactionService;

    @GetMapping("")
    public ResponseEntity<Iterable<InventoryTransaction>> getAllInventoryTransaction(){
        return inventoryTransactionService.getAllInventoryTransaction();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryTransaction> getInventoryTransaction(@PathVariable("id") Integer id){
        return inventoryTransactionService.getInventoryTransaction(id);
    }

    @PostMapping("")
    public ResponseEntity<InventoryTransaction> postInventoryTransaction(@RequestBody InventoryTransaction inventoryTransaction){
        return inventoryTransactionService.postInventoryTransaction(inventoryTransaction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventoryTransaction> updateInventoryTransaction(@RequestBody InventoryTransaction inventoryTransaction, @PathVariable("id") Integer id){
        return inventoryTransactionService.updateInventoryTransaction(id, inventoryTransaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InventoryTransaction> deleteInventoryTransaction(@PathVariable("id") Integer id){
        return inventoryTransactionService.deleteInventoryTransaction(id);
    }
}
