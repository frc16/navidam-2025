package com.navidam.api.web.controller;


import com.navidam.api.service.PersonaInterfazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class PersonaController {

    final private PersonaInterfazService personaService1;

    @Autowired
    PersonaController (PersonaInterfazService personaService){
        this.personaService1=personaService;
    }

}
