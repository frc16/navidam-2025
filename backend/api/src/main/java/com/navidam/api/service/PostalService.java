package com.navidam.api.service;

import com.navidam.api.DTOS.request.PostalRequest;
import com.navidam.api.jpa.entity.Persona;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class PostalService {

    private final PersonaService personaService;
    private final CatalogoService catalogoService;
    private final TemplateEngine templateEngine;
    private final PostalSendService postalSendService;

    // CONSTRUCTOR RELLENO CORRECTAMENTE
    public PostalService(PersonaService personaService, CatalogoService catalogoService,
            TemplateEngine templateEngine, PostalSendService postalSendService) {
        this.personaService = personaService;
        this.catalogoService = catalogoService;
        this.templateEngine = templateEngine;
        this.postalSendService = postalSendService;
    }

    public String previsualizar(PostalRequest request) {
        // Validaciones
        personaService.buscarPorId(request.getDestinatarioId());
        catalogoService.detallePlantilla(request.getPlantillaId());

        // Renderizado
        Context context = new Context();
        context.setVariables(request.getCampos());

        return templateEngine.process(request.getPlantillaId(), context);
    }

    public void enviar(PostalRequest request) {
        // 1. Recuperar datos
        Persona destinatario = personaService.buscarPorId(request.getDestinatarioId());

        // 2. Generar contenido
        String html = previsualizar(request);
        // Aquí request.getMelodiaId() ahora devuelve String gracias al paso 1
        byte[] midi = catalogoService.generarMidi(request.getMelodiaId());

        // Obtener remitente de forma segura
        String remitente = "Desconocido";
        if (request.getCampos() != null && request.getCampos().containsKey("remitente")) {
            remitente = request.getCampos().get("remitente").toString();
        }

        // 3. Enviar a n8n
        postalSendService.enviarPostal(
                destinatario.getNombre(),
                destinatario.getEmail(),
                "🎄 Postal NaviDAM de " + remitente,
                html,
                midi,
                request.getPlantillaId(),
                request.getMelodiaId());
    }
}