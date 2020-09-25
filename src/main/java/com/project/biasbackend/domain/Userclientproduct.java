package com.project.biasbackend.domain;

import com.project.biasbackend.domain.Compra;
import com.project.biasbackend.domain.UserClient;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "userclientproduct")
@NamedQueries({
    @NamedQuery(name = "Userclientproduct.findAll", query = "SELECT u FROM Userclientproduct u"),
    @NamedQuery(name = "Userclientproduct.findByIdUserproduct", query = "SELECT u FROM Userclientproduct u WHERE u.idUserproduct = :idUserproduct")})
public class Userclientproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_userproduct")
    private Integer idUserproduct;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userclientproductIdUserproduct")
    private List<Compra> compraList;
    @JoinColumn(name = "product_id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product productIdProduct;
    @JoinColumn(name = "user_client_id_userclient", referencedColumnName = "id_userclient")
    @ManyToOne(optional = false)
    private UserClient userClientIdUserclient;

    public Userclientproduct() {
    }

    public Userclientproduct(Integer idUserproduct) {
        this.idUserproduct = idUserproduct;
    }

    public Integer getIdUserproduct() {
        return idUserproduct;
    }

    public void setIdUserproduct(Integer idUserproduct) {
        this.idUserproduct = idUserproduct;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    public Product getProductIdProduct() {
        return productIdProduct;
    }

    public void setProductIdProduct(Product productIdProduct) {
        this.productIdProduct = productIdProduct;
    }

    public UserClient getUserClientIdUserclient() {
        return userClientIdUserclient;
    }

    public void setUserClientIdUserclient(UserClient userClientIdUserclient) {
        this.userClientIdUserclient = userClientIdUserclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserproduct != null ? idUserproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userclientproduct)) {
            return false;
        }
        Userclientproduct other = (Userclientproduct) object;
        if ((this.idUserproduct == null && other.idUserproduct != null) || (this.idUserproduct != null && !this.idUserproduct.equals(other.idUserproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Userclientproduct[ idUserproduct=" + idUserproduct + " ]";
    }
    
}
