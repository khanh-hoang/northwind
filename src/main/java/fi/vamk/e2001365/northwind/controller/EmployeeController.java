package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Employee;
import fi.vamk.e2001365.northwind.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public ResponseEntity<Iterable<Employee>> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("")
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("id") Integer id){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Integer id){
        return employeeService.deleteEmployee(id);
    }
}
