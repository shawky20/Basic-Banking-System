package backend.example.backend.controller;

import backend.example.backend.service.TransfersServices;
import backend.example.backend.Entities.transfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class TransfersController {

    @Autowired
    TransfersServices transfersServices;

    @PostMapping("/add")
    public transfers transfer(@RequestBody transfers t ){
        return transfersServices.transfer(t);
    }
}
