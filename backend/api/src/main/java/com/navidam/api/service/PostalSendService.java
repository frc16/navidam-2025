package com.navidam.api.service;

import com.navidam.api.n8n.N8nClient;
import com.navidam.api.n8n.N8nWebhookRequest;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.Map;

@Service
public class PostalSendService {

    private final N8nClient n8nClient;

    public PostalSendService(N8nClient n8nClient) {
        this.n8nClient = n8nClient;
    }

    public void enviarPostal(String nombreTo, String emailTo, String subject, String html, byte[] midiBytes,
            String plantillaId, String melodiaId) {

        // 1. Convertir bytes a Base64
        String base64Midi = Base64.getEncoder().encodeToString(midiBytes);

        N8nWebhookRequest payload = new N8nWebhookRequest(
                new N8nWebhookRequest.Recipient(nombreTo, emailTo),
                subject,
                html,
                List.of(new N8nWebhookRequest.Attachment("melodia.mid", "audio/midi", base64Midi)),
                Map.of("plantillaId", plantillaId, "melodiaId", melodiaId));

        n8nClient.sendPostal(payload);
    }
}