package com.example.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "quickstart-events", groupId = "console-consumer-26067")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
