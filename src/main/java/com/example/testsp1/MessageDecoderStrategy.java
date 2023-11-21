package com.example.testsp1;

public class MessageDecoderStrategy {
    private MessageDecoder decoder;

    public void setDecoder(MessageDecoder decoder) {
        this.decoder = decoder;
    }

    public String decodeMessage(String message) {
        if (decoder == null) {
            throw new IllegalStateException("Decoder not set");
        }
        return decoder.decode(message);
    }
}
