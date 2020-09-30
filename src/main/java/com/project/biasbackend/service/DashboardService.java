package com.project.biasbackend.service;

import com.project.biasbackend.dao.DashboardRepository;
import com.project.biasbackend.domain.Dashboard;
import com.project.biasbackend.domain.Persona;
import com.project.biasbackend.dto.DashboardDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DashboardService {


    DashboardRepository dashboardRepository;
    PersonaService userService;

    @Autowired
    public DashboardService(DashboardRepository dashboardRepository,PersonaService userService) {
        this.dashboardRepository = dashboardRepository;
        this.userService=userService;
    }
    public List<DashboardDto> findDashboardListByUserIdWithDashboardDtoParameter(int idUser){

        return findDashboardListByUserId(idUser);
    }


    public Dashboard getDashboardByIdDashboard(int idDashboard){
        Dashboard dashboard=dashboardRepository.findByIdDashboard(idDashboard);
        return dashboard;
    }
    public List<DashboardDto> findDashboardListByUserId(int idUser){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        Persona user=userService.getUserByid(idUser);
        for(Dashboard dashboard:user.getDashboardList()){
            dashboardDtoList.add(new DashboardDto(dashboard));
        }
        return dashboardDtoList;
    }
    public Dashboard addDashboard(DashboardDto dashboardDto) {
        Persona user= new Persona();
        Dashboard dashboard=new Dashboard();
        dashboard.setIdDashboard(dashboardDto.getIdDashboard());
        dashboard.setName(dashboardDto.getName());
        dashboard.setTxUser(dashboardDto.getTxUser());
        dashboard.setTxHost(dashboardDto.getTxHost());
        dashboard.setTxDate(dashboardDto.getTxDate());
        //dashboard.setUserIdUser(user);
        dashboardRepository.save(dashboard);
        return dashboard;
    }
}

