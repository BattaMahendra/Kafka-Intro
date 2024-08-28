package com.kafka.config;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "Mahendra_My_First_Kafka_Topic",groupId = "Mahendra_Topics_Group")
    public void listener(String message){
        System.out.println("/n/n Received the message: "+message);
    }
}
