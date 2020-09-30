package com.project.biasbackend.controller;

import com.project.biasbackend.domain.View;
import com.project.biasbackend.dto.ViewDto;
import com.project.biasbackend.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/",maxAge = 3600)
@RestController
@RequestMapping("/k1/view")
public class ViewController {


    private static final Logger LOGGER= LoggerFactory.getLogger(ViewController.class);
    private ViewService viewService;

    @Autowired
    public ViewController(ViewService viewService) {
        this.viewService = viewService;
    }

    @RequestMapping(value = "/",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<ViewDto> all(){
        List<ViewDto> viewDtoList=new ArrayList<>();
        for(ViewDto viewDto:viewService.findAllViews()){
            viewDtoList.add(viewDto);
        }
        return viewDtoList;
    }

    @RequestMapping(value = "/dashviews/{id}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ViewDto> getViewListByIdDash(@PathVariable("id") Integer idDashboard){
        return viewService.findViewByIdDashboardWithViewDtoParameter(idDashboard);
//        return viewService.findViewByIdDashboard(1);
    }

    @PostMapping("/add/")
    public View addView(@RequestBody ViewDto view){
        LOGGER.info("Agregando usuario");
        return viewService.addView(view);
    }
}
