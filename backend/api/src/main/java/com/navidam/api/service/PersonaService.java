package com.navidam.api.service;

import com.navidam.api.jpa.entity.Persona;
import com.navidam.api.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    public Persona obtenePersonarPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    public List<Persona> listar(String q) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    public Object crear(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crear'");
    }
    
}