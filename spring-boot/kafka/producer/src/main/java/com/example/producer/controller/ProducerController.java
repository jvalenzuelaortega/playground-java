package com.example.producer.controller;

import com.example.producer.service.PublishService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private PublishService publishService;

    public ProducerController(PublishService publishService) {
        this.publishService = publishService;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody String message) {
        publishService.sendMessage(message);
        return ResponseEntity.ok(message);
    }
}
