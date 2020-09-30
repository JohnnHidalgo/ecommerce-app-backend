package com.project.biasbackend.service;

import com.project.biasbackend.dao.ViewRepositary;
import com.project.biasbackend.domain.Dashboard;
import com.project.biasbackend.domain.View;
import com.project.biasbackend.dto.ViewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewService {

    ViewRepositary viewRepository;
    DashboardService dashboardService;

    @Autowired
    public ViewService(ViewRepositary viewRepository,DashboardService dashboardService) {
        this.viewRepository = viewRepository;
        this.dashboardService=dashboardService;
    }

    public List<ViewDto> findAllViews(){
        List<ViewDto> viewDtoList= new ArrayList<>();
        for (View view:viewRepository.findAll()){
            viewDtoList.add(new ViewDto(view));
        }
        return viewDtoList;
    }

    public List<ViewDto> findViewByIdDashboardWithViewDtoParameter(int idDashboard){
        return findViewByIdDashboard(idDashboard);
    }

    public List<ViewDto> findViewByIdDashboard(int idDashboard){
        List<ViewDto> viewDtoList=new ArrayList<>();
        Dashboard dashboard=dashboardService.getDashboardByIdDashboard(idDashboard);
        for(View view:dashboard.getViewList()){
            viewDtoList.add(new ViewDto(view));
        }
        return viewDtoList;
    }

    public View addView(ViewDto viewDto){
        View view=new View();
        Dashboard dashboard=dashboardService.getDashboardByIdDashboard(viewDto.getIdDashboard());
        view.setIdView(viewDto.getIdView());
        view.setName(viewDto.getName());
        view.setActive(viewDto.getActive());
        view.setTxUser(viewDto.getTxUser());
        view.setTxDate(viewDto.getTxDate());
        view.setTxHost(viewDto.getTxHost());
       // view.setDashboardiddashboard(dashboard);
//        view.se
        viewRepository.save(view);
        return view;
    }
}
