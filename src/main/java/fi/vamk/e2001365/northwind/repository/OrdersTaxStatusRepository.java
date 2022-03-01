package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.OrdersTaxStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersTaxStatusRepository extends JpaRepository<OrdersTaxStatus, Boolean> {
}