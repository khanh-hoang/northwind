package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.SalesReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesReportRepository extends JpaRepository<SalesReport, String> {
}