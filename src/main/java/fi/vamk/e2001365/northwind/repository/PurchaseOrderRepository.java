package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
}