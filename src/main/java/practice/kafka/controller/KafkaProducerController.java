package practice.kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.kafka.service.ProducerService;

@RestController
@RequiredArgsConstructor
public class KafkaProducerController {

    private final ProducerService producerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        producerService.sendMessage(message);
    }

}
