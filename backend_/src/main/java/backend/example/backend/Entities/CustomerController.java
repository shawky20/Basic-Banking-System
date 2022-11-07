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
    public List<customer> getAll(){
        return customerServices.getAll();
    }

    @PostMapping("/update")
    public customer update(customer c){
        return customerServices.updateCustomer(c);
    }
}
