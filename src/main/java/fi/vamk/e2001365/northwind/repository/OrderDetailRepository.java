package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}