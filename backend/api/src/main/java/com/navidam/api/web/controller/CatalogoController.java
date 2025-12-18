package com.navidam.api.web.controller;

import org.springframework.web.bind.annotation.*;

import com.navidam.api.DTOS.MelodiaDTO;
import com.navidam.api.DTOS.PlantillaDetalleDTO;
import com.navidam.api.DTOS.PlantillaResumenDTO;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CatalogoController {

    private final CatalogoService service;

    public CatalogoController(CatalogoService service) {
        this.service = service;
    }

    // 2.1 Listar plantillas
    @GetMapping("/plantillas")
    public List<PlantillaResumenDTO> listarPlantillas() {
        return service.listarPlantillas();
    }

    // 2.2 Detalle de plantilla
    @GetMapping("/plantillas/{id}")
    public PlantillaDetalleDTO detallePlantilla(@PathVariable String id) {
        return service.detallePlantilla(id);
    }

    // 3.1 Listar melodías
    @GetMapping("/melodias")
    public List<MelodiaDTO> listarMelodias() {
        return service.listarMelodias();
    }
}