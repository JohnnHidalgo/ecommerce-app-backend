package com.project.biasbackend.controller;

import com.project.biasbackend.dto.PersonaDto;
import com.project.biasbackend.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/persona")
public class PersonaController {

    private PersonaService personaService;
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

/*
    @RequestMapping("/{id}")
    public PersonaDto getUserNicknameAndPassword(@PathVariable("id") int id){
        LOGGER.info("Obteniendo id graphic");
        PersonaDto personaDto=new PersonaDto(personaService.findPersonaId(id));
        return  personaDto;
    }*/


    @PostMapping("/login")
    public PersonaDto login(@RequestBody PersonaDto user){

        System.out.println("UUUUUUUUUUUUUUUUUSSSSSSSSSSSSEEEEEEEEEEEEERRRRRRRRRRR    ---  "+user.getNicknameUser());

        PersonaDto userDto=new PersonaDto(personaService.verifyUser(user));
        return userDto;

    }
}
