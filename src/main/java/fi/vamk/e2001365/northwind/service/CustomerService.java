package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Customer;
import fi.vamk.e2001365.northwind.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity<Iterable<Customer>> getAllCustomer(){
        return ResponseEntity.ok(customerRepository.findAll());
    }

    public ResponseEntity<Customer> getCustomer(Integer id) {
        if (customerRepository.existsById(id))
            return ResponseEntity.ok(customerRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Customer> postCustomer(Customer customer){
        if (customerRepository.existsById(customer.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(customerRepository.save(customer));
    }

    public ResponseEntity<Customer> updateCustomer(Integer id, Customer customer){
        customer.setId(id);
        if (customerRepository.existsById(id))
            return ResponseEntity.ok(customerRepository.save(customer));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteCustomer(Integer id){
        if (customerRepository.existsById(id)){
            customerRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
