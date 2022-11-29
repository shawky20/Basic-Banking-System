package backend.example.backend.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRep customerRep;


    public List<Customer> getAll(){
        return customerRep.findAll();
    }
    public Customer updateCustomer(Customer customer){
//        Customer customer1 =  customerRep.findById(customer.getId());
//        customer1 = customer;
        customerRep.save(customer);
        return customer;
    }

    public Customer addCustomer(Customer customer){
        customerRep.save(customer);
        return customer;
    }


}
