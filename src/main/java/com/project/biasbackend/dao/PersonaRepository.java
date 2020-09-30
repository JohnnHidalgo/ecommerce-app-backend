package com.project.biasbackend.dao;

import com.project.biasbackend.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/*public interface PersonaRepository extends JpaRepository<Persona,Integer> {
/**///    @Query(value = "select * from  persona where id_user=?1",nativeQuery = true)
//    Persona findPersonabyidUser(int var1);
//}
