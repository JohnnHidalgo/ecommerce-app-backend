package com.project.biasbackend.dto;

import com.project.biasbackend.domain.View;

public class ViewDto {

    private Integer idView;
    private String name;
    private String txUser;
    private String txHost;
    private String txDate;
    private int active;
    private int idDashboard;

    public ViewDto() {
    }

    public ViewDto(View view) {
        this.idView = view.getIdView();
        this.name = view.getName();
        this.txUser = view.getTxUser();
        this.txHost = view.getTxHost();
        this.txDate = view.getTxDate();
        this.active = view.getActive();
    }

    public Integer getIdView() {
        return idView;
    }

    public void setIdView(Integer idView) {
        this.idView = idView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getIdDashboard() {
        return idDashboard;
    }

    public void setIdDashboard(int idDashboard) {
        this.idDashboard = idDashboard;
    }

}
