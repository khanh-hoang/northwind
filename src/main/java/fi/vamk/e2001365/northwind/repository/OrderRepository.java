package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}