package com.navidam.api.web.controller;

import com.navidam.api.jpa.entity.Persona;
import com.navidam.api.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*") // Permite peticiones desde cualquier Front
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    
    @GetMapping
    public List<Persona> listar(@RequestParam(required = false) String q) {
        return service.listar(q);
    }

 
    @PostMapping
    public ResponseEntity<Object> crear(@RequestBody Persona persona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.crear(persona));
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminarPersona(id);
        return ResponseEntity.noContent().build();
    }
}