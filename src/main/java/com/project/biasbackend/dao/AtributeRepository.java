package com.project.biasbackend.dao;


import com.project.biasbackend.domain.Atribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtributeRepository extends JpaRepository<Atribute, Integer> {

     Atribute findAtributebyidAtribute(int var1);
}