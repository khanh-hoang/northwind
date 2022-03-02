package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Product;
import fi.vamk.e2001365.northwind.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository ProductRepository;

    public ResponseEntity<Iterable<Product>> getAllProduct(){
        return ResponseEntity.ok(ProductRepository.findAll());
    }

    public ResponseEntity<Product> getProduct(Integer id) {
        if (ProductRepository.existsById(id))
            return ResponseEntity.ok(ProductRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Product> postProduct(Product product){
        if (ProductRepository.existsById(product.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(ProductRepository.save(product));
    }

    public ResponseEntity<Product> updateProduct(Integer id, Product product){
        product.setId(id);
        if (ProductRepository.existsById(id))
            return ResponseEntity.ok(ProductRepository.save(product));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteProduct(Integer id){
        if (ProductRepository.existsById(id)){
            ProductRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
