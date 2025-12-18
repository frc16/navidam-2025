package com.navidam.api.web.controller;

import com.navidam.api.service.PostalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/postales")
@CrossOrigin(origins = "*")
public class PostalController {

    private final PostalService postalService;

    public PostalController(PostalService postalService) {
        this.postalService = postalService;
    }

    // 4.1 Previsualizar (Renderiza HTML)
    @PostMapping("/preview")
    public ResponseEntity<Map<String, String>> previsualizar( @RequestBody PostalRequest request) {
        String html = postalService.previsualizar(request);
        return ResponseEntity.ok(Map.of("html", html));
    }

    // 4.2 Enviar (Llama a n8n)
    @PostMapping("/notificacion")
    public ResponseEntity<PostalResponse> enviar(@RequestBody PostalRequest request) {
        postalService.enviar(request);
        
        return ResponseEntity.ok(new PostalResponse(
            "OK", 
            "Postal enviada correctamente", 
            "https://navidam.com/view/" + System.currentTimeMillis() // URL ficticia
        ));
    }
}