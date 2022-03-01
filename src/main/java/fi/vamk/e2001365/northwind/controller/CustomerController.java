package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Customer;
import fi.vamk.e2001365.northwind.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<Iterable<Customer>> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer id){
        return customerService.getCustomer(id);
    }

    @PostMapping("")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer){
        return customerService.postCustomer(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") Integer id){
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer id){
        return customerService.deleteCustomer(id);
    }
}
