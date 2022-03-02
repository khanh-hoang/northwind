package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.OrdersStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersStatusRepository extends JpaRepository<OrdersStatus, Integer> {
}