package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.InventoryTransactionType;
import fi.vamk.e2001365.northwind.service.InventoryTransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inventory/transaction/type")
public class InventoryTransactionTypeController {
    @Autowired
    private InventoryTransactionTypeService inventoryTransactionTypeService;

    @GetMapping("")
    public ResponseEntity<Iterable<InventoryTransactionType>> getAllInventoryTransactionType(){
        return inventoryTransactionTypeService.getAllInventoryTransactionType();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryTransactionType> getInventoryTransactionType(@PathVariable("id") Integer id){
        return inventoryTransactionTypeService.getInventoryTransactionType(id);
    }

    @PostMapping("")
    public ResponseEntity<InventoryTransactionType> postInventoryTransactionType(@RequestBody InventoryTransactionType inventoryTransactionType){
        return inventoryTransactionTypeService.postInventoryTransactionType(inventoryTransactionType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventoryTransactionType> updateInventoryTransactionType(@RequestBody InventoryTransactionType inventoryTransactionType, @PathVariable("id") Integer id){
        return inventoryTransactionTypeService.updateInventoryTransactionType(id, inventoryTransactionType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InventoryTransactionType> deleteInventoryTransactionType(@PathVariable("id") Integer id){
        return inventoryTransactionTypeService.deleteInventoryTransactionType(id);
    }
}
