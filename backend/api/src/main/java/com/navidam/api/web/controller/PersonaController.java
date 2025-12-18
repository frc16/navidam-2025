package com.navidam.api.web.controller;


import com.navidam.api.service.PersonaInterfazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class PersonaController {

    final private PersonaInterfazService personaService1;

    @Autowired
    PersonaController (PersonaInterfazService personaService){
        this.personaService1=personaService;
    }

    

    @DeleteMapping("/api/personas/{id}")
    public void deletePersona(@PathVariable Long id){
        this.personaService1.deletePersona(id);
    }





}
