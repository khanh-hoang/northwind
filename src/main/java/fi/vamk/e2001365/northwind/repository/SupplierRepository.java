package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}