package com.project.biasbackend.dao;


import com.project.biasbackend.domain.Atribute;
import com.project.biasbackend.domain.GraphicType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtributeRepository extends JpaRepository<GraphicType, Integer> {

//     Atribute findByIdAtribute(int idAttribute);
}