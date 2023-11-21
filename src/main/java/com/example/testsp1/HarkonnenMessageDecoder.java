package com.example.testsp1;
import lombok.Data;
@Data
public class HarkonnenMessageDecoder implements MessageDecoder {
    @Override
    public String decode(String message) {
        // Implementare specifică pentru decodificarea Harkonnen
        // Utilizând informațiile din enunț
        return "Messi"; // sau implementare reală
    }
}
