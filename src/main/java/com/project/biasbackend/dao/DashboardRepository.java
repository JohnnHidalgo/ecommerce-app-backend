package com.project.biasbackend.dao;

import com.project.biasbackend.domain.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DashboardRepository extends JpaRepository<Dashboard,Integer> {
    @Query(value = "select * from dashboard where id_dashboard=?1 LIMIT 1", nativeQuery = true)
    Dashboard findByIdDashboard(int idDashboard);
}
