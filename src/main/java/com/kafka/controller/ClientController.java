package com.kafka.controller;


import com.kafka.config.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class ClientController {

    @Autowired
    Producer producer;


    @PostMapping("/send")
    public String sendMessage(@RequestBody String msgToBeSent){

        return producer.sendMessageToKafkaProducer(msgToBeSent);

    }
}
