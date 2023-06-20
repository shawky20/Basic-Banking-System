package backend.example.backend.service;

import backend.example.backend.Entities.Customer;
import backend.example.backend.dao.CustomerRep;
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

    public Customer getById(Long id){
        return customerRep.findById(id).get();
    }
    public Customer updateCustomer(Customer customer){
        customerRep.save(customer);
        return customer;
    }

    public Customer addCustomer(Customer customer){
        customerRep.save(customer);
        return customer;
    }


}
