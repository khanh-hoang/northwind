package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
}