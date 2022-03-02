package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Supplier;
import fi.vamk.e2001365.northwind.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService SupplierService;

    @GetMapping("")
    public ResponseEntity<Iterable<Supplier>> getAllSupplier(){
        return SupplierService.getAllSupplier();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplier(@PathVariable("id") Integer id){
        return SupplierService.getSupplier(id);
    }

    @PostMapping("")
    public ResponseEntity<Supplier> postSupplier(@RequestBody Supplier supplier){
        return SupplierService.postSupplier(supplier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier, @PathVariable("id") Integer id){
        return SupplierService.updateSupplier(id, supplier);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Supplier> deleteSupplier(@PathVariable("id") Integer id){
        return SupplierService.deleteSupplier(id);
    }
}
