package backend.example.backend.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class TransfersController {

    @Autowired
    TransfersServices transfersServices;

    @PostMapping("/add")
    public transfers transfer(transfers t ){
        return transfersServices.transfer(t);
    }
}
