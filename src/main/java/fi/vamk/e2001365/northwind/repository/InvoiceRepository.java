package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}