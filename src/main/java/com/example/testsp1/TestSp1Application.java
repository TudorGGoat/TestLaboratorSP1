package com.example.testsp1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class TestSp1Application {

    public static void main(String[] args) throws IOException {
        List<Message> messages = new ObjectMapper().readValue(
                new URL("file:src/messages.json"),
                new TypeReference<List<Message>>() {}
        );

        MessageDecoderStrategy decoderStrategy = new MessageDecoderStrategy();

        for (Message message : messages) {
            MessageDecoder decoder = MessageDecoderFactory.getMessageDecoder(message.getHouse());
            if (decoder != null) {
                decoderStrategy.setDecoder(decoder);
                String decodedMessage = decoderStrategy.decodeMessage(message.getMessage());
                System.out.println("Decoded message: " + decodedMessage);
            }
        }

        SpringApplication.run(TestSp1Application.class, args);
    }
}
