package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Product;
import fi.vamk.e2001365.northwind.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService ProductService;

    @GetMapping("")
    public ResponseEntity<Iterable<Product>> getAllProduct(){
        return ProductService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){
        return ProductService.getProduct(id);
    }

    @PostMapping("")
    public ResponseEntity<Product> postProduct(@RequestBody Product product){
        return ProductService.postProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("id") Integer id){
        return ProductService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Integer id){
        return ProductService.deleteProduct(id);
    }
}
