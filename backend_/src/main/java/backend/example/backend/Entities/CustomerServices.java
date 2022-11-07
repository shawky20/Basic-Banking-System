package backend.example.backend.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRep customerRep;


    public List<customer> getAll(){
        return customerRep.findAll();
    }
    public customer updateCustomer(customer customer){
        customerRep.save(customer);
        return customer;
    }
}
