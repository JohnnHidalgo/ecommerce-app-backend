package com.project.biasbackend.dao;

import com.project.biasbackend.domain.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ViewRepositary extends JpaRepository<View,Integer> {

    View findByName(String viewName);

    @Query(value = "select * from view where id_view=?1 LIMIT 1",nativeQuery = true)
    View findByIdView(int idView);
}
