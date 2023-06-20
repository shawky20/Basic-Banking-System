package backend.example.backend.controller;


import backend.example.backend.Entities.Customer;
import backend.example.backend.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServices customerServices;

    @GetMapping("/all")
    public List<Customer> getAll(){
        return customerServices.getAll();
    }

    @GetMapping("/getById")
    public Customer getCustomerById(@RequestParam Long id){
       return customerServices.getById(id);
    }
    @PostMapping("/update")
    public Customer update(Customer c){
        return customerServices.updateCustomer(c);
    }
    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer){
        return customerServices.addCustomer(customer);
    }
}
