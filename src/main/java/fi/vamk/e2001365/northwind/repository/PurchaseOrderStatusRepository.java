package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderStatusRepository extends JpaRepository<PurchaseOrderStatus, Integer> {
}