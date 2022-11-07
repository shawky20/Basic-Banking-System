package backend.example.backend.Entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<customer,Long> {


}
