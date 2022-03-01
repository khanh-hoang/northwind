package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.OrderDetailsStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsStatusRepository extends JpaRepository<OrderDetailsStatus, Integer> {
}