package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.EmployeePrivilege;
import fi.vamk.e2001365.northwind.entity.EmployeePrivilegeId;
import fi.vamk.e2001365.northwind.service.EmployeePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/employee/privilege")
public class EmployeePrivilegeController {
    @Autowired
    private EmployeePrivilegeService employeePrivilegeService;

    @GetMapping("")
    public ResponseEntity<Iterable<EmployeePrivilege>> getAllEmployeePrivilege(){
        return employeePrivilegeService.getAllEmployeePrivilege();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeePrivilege> getEmployeePrivilege(@RequestBody EmployeePrivilegeId id){
        return employeePrivilegeService.getEmployeePrivilege(id);
    }
}
