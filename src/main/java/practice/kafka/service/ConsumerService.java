package practice.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import practice.kafka.config.KafkaConstants;

@Service
public class ConsumerService {

    @KafkaListener(topics = KafkaConstants.KAFKA_TOPIC, groupId = KafkaConstants.CONSUMER_GROUP_ID)
    public void consumerMessage(String message) {
        System.out.println("chatting : " + message);
    }
}


