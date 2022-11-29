package backend.example.backend.Entities;

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
