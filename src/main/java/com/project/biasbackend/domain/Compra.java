package com.project.biasbackend.domain;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "compra")
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findByIdCompra", query = "SELECT c FROM Compra c WHERE c.idCompra = :idCompra")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_compra")
    private Integer idCompra;
    @JoinColumn(name = "user_client_id_userclient", referencedColumnName = "id_userclient")
    @ManyToOne(optional = false)
    private UserClient userClientIdUserclient;
    @JoinColumn(name = "userclientproduct_id_userproduct", referencedColumnName = "id_userproduct")
    @ManyToOne(optional = false)
    private Userclientproduct userclientproductIdUserproduct;

    public Compra() {
    }

    public Compra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public UserClient getUserClientIdUserclient() {
        return userClientIdUserclient;
    }

    public void setUserClientIdUserclient(UserClient userClientIdUserclient) {
        this.userClientIdUserclient = userClientIdUserclient;
    }

    public Userclientproduct getUserclientproductIdUserproduct() {
        return userclientproductIdUserproduct;
    }

    public void setUserclientproductIdUserproduct(Userclientproduct userclientproductIdUserproduct) {
        this.userclientproductIdUserproduct = userclientproductIdUserproduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Compra[ idCompra=" + idCompra + " ]";
    }
    
}
