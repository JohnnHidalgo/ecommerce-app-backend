package com.project.biasbackend.controller;

import com.project.biasbackend.service.DashboardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.project.biasbackend.domain.Dashboard;
import com.project.biasbackend.dto.DashboardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/dashboard")
public class DashboardController {

    private DashboardService dashboardService;
    private static final Logger LOGGER= LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping("/userdash/{id}")
    public List<DashboardDto> getAllDashboardsByIdUser(@PathVariable("id") Integer idUser){
        return dashboardService.findDashboardListByUserIdWithDashboardDtoParameter(idUser);
    }

    @PostMapping("/add/")
    public Dashboard addView(@RequestBody DashboardDto dashboard){
        LOGGER.info("Agregando usuario");
        return dashboardService.addDashboard(dashboard);
    }
}
