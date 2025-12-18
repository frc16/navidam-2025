package com.navidam.api.jpa.dto.request;

public record PersonaRequest(
        Long id,
        String nombre,
        String email
){}