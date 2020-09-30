package com.project.biasbackend.service;

//import com.project.biasbackend.dao.PersonaRepository;
import com.project.biasbackend.dao.PersonaRepository;
import com.project.biasbackend.domain.Persona;
import com.project.biasbackend.dto.PersonaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    PersonaRepository personaRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(PersonaService.class);

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

/*
    public Persona findPersonaId(int id){
        return personaRepository.findPersonabyidUser(id);
    }*/

    public Persona verifyUser(PersonaDto user){
        Persona user2=personaRepository.findByNameAndPassword(user.getNicknameUser(),user.getPassword());
        // User user2=userRepository.findByNameAndPassword(user.getNicknameUser(),user.getPassword());
        LOGGER.info("ENTRA");

        if (user2 == null) {
            LOGGER.info("no se encontro");
        }else {
            LOGGER.info("SSSSSSIIIIIIII se EEEEEENNNNCCCCOOOONNNNTTTRRRROOO");
        }

        return user2;
    }
    public Persona getUserByid(int idUser){
        Persona user=personaRepository.findByIdUser(idUser);
        if(user==null){
            LOGGER.info("User vacio");
        }
        return user;
    }
}

