package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Employee;
import fi.vamk.e2001365.northwind.entity.EmployeePrivilege;
import fi.vamk.e2001365.northwind.entity.EmployeePrivilegeId;
import fi.vamk.e2001365.northwind.repository.EmployeePrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeePrivilegeService {
    @Autowired
    private EmployeePrivilegeRepository employeePrivilegeRepository;

    public ResponseEntity<Iterable<EmployeePrivilege>> getAllEmployeePrivilege() {
        return ResponseEntity.ok(employeePrivilegeRepository.findAll());
    }
    public ResponseEntity<EmployeePrivilege> getEmployeePrivilege(EmployeePrivilegeId id) {
        if (employeePrivilegeRepository.existsById(id))
            return ResponseEntity.ok(employeePrivilegeRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

}