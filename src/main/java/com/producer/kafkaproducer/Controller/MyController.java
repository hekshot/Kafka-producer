package com.producer.kafkaproducer.Controller;

import com.producer.kafkaproducer.Service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/sendData")
    public String sendData(@RequestBody String jsonData) {
        kafkaProducerService.produceMessage(jsonData);
        return "Data sent successfully!";
    }
}
