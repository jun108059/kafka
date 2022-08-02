package practice.kafka.dto;

import lombok.Data;

@Data
public class ChatMessage {
    //보내는 사람
    private String sender;
    //내용
    private String message;
}
