package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.EmployeePrivilege;
import fi.vamk.e2001365.northwind.entity.EmployeePrivilegeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePrivilegeRepository extends JpaRepository<EmployeePrivilege, EmployeePrivilegeId> {
}