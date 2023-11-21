package com.example.testsp1;
import lombok.Data;
@Data
public class AtreidesMessageDecoder implements MessageDecoder {
    @Override
    public String decode(String message) {
        // Implementare specifică pentru decodificarea Atreides
        // Utilizând informațiile din enunț
        return "Messi"; // sau implementare reală
    }
}
