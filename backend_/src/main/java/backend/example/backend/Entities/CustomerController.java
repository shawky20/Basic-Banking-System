package backend.example.backend.Entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/update")
    public Customer update(Customer c){
        return customerServices.updateCustomer(c);
    }
    @GetMapping("/add")
    public Customer add(){
        Customer customer = new Customer(3,"cust23","cust1@gail.com",1000);

        return customerServices.addCustomer(customer);
    }
}
