package com.example.testsp1;

public class MessageDecoderFactory {
    public static MessageDecoder getMessageDecoder(String house) {
        if ("atreides".equals(house)) {
            return new AtreidesMessageDecoder();
        } else if ("harkonnen".equals(house)) {
            return new HarkonnenMessageDecoder();
        }
        return null;
    }
}
