package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.PurchaseOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetail, Integer> {
}