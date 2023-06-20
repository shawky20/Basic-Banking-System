package backend.example.backend.dao;

import backend.example.backend.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer,Long> {
    public Customer getById(Long id);

}
