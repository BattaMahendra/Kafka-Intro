package com.kafka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class  Producer{

    @Autowired
    KafkaTemplate<String , String > kafkaTemplate;

    public String sendMessageToKafkaProducer(String str){

        kafkaTemplate.send("Mahendra_My_First_Kafka_Topic",str);
        return "";
    }
}
