package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}