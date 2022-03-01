package fi.vamk.e2001365.northwind.repository;

import fi.vamk.e2001365.northwind.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}