package backend.example.backend.dao;


import backend.example.backend.Entities.transfers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfersRep extends JpaRepository<transfers,Long> { // Long is the type of the primary key

}
