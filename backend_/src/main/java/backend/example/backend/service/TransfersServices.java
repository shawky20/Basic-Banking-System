package backend.example.backend.service;

import backend.example.backend.Entities.transfers;
import backend.example.backend.dao.TransfersRep;
import backend.example.backend.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransfersServices {
    @Autowired
    CustomerServices customerServices;
    @Autowired
    TransfersRep transfersRep;

    public transfers transfer(transfers t){
        transfersRep.save(t);
        return t;
    }
}
