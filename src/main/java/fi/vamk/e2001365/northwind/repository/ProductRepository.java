package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}