package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.InventoryTransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryTransactionTypeRepository extends JpaRepository<InventoryTransactionType, Boolean> {
}