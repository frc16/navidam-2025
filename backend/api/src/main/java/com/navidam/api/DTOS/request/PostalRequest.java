package com.navidam.api.DTOS.request;

import java.util.Map;

public class PostalRequest {

    private Long destinatarioId;

    private String plantillaId;

    private String melodiaId;

    private Map<String, Object> campos;

    // Getters y Setters
    public Long getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(Long destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public String getPlantillaId() {
        return plantillaId;
    }

    public void setPlantillaId(String plantillaId) {
        this.plantillaId = plantillaId;
    }

    public String getMelodiaId() {
        return melodiaId;
    }

    public void setMelodiaId(String melodiaId) {
        this.melodiaId = melodiaId;
    }

    public Map<String, Object> getCampos() {
        return campos;
    }

    public void setCampos(Map<String, Object> campos) {
        this.campos = campos;
    }
}