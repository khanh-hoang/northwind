package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepository extends JpaRepository<Shipper, Integer> {
}