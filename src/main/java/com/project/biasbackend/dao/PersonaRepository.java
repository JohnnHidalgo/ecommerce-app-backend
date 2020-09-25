package com.project.biasbackend.dao;

import com.project.biasbackend.domain.Persona;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface PersonaRepository extends JpaAttributeConverter<Persona,Integer> {
    Persona findPersonabyidUser(int var1);
}
