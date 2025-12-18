package com.navidam.api.n8n;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class N8nClient {

    private final RestTemplate restTemplate;

    // Pon la URL de tu webhook de n8n en application.properties o hardcodeada aquí
    // para pruebas
    @Value("${n8n.webhook.url:https://n8n.tu-servidor.com/webhook/test}")
    private String n8nUrl;

    public N8nClient() {
        this.restTemplate = new RestTemplate();
    }

    public void sendPostal(N8nWebhookRequest payload) {
        try {
            // Hacemos el POST a n8n
            restTemplate.postForEntity(n8nUrl, payload, String.class);
        } catch (Exception e) {
            // En un caso real, lanzaríamos una excepción personalizada (502/504)
            throw new RuntimeException("Error comunicando con n8n: " + e.getMessage());
        }
    }
}