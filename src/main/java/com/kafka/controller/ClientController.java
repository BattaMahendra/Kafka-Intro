package com.kafka.controller;


import com.kafka.config.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/kafka")
public class ClientController {

    @Autowired
    Producer producer;


    @PostMapping("/send")
    public String sendMessage(@RequestBody String msgToBeSent){

        return producer.sendMessageToKafkaProducer(msgToBeSent);

    }
}
