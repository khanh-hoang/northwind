package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Employee;
import fi.vamk.e2001365.northwind.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public ResponseEntity<Iterable<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    public ResponseEntity<Employee> getEmployee(Integer id) {
        if (employeeRepository.existsById(id))
            return ResponseEntity.ok(employeeRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Employee> postEmployee(Employee employee){
        if (employeeRepository.existsById(employee.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(employeeRepository.save(employee));
    }

    public ResponseEntity<Employee> updateEmployee(Integer id, Employee employee){
        employee.setId(id);
        if (employeeRepository.existsById(id))
            return ResponseEntity.ok(employeeRepository.save(employee));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteEmployee(Integer id){
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
