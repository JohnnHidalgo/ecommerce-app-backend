package com.project.biasbackend.domain;

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
@Table(name = "strore")
@NamedQueries({
    @NamedQuery(name = "Strore.findAll", query = "SELECT s FROM Strore s"),
    @NamedQuery(name = "Strore.findByIdStore", query = "SELECT s FROM Strore s WHERE s.idStore = :idStore")})
public class Strore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_store")
    private Integer idStore;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stroreIdStore")
    private List<Product> productList;
    @JoinColumn(name = "user_admin_id_useradmin", referencedColumnName = "id_useradmin")
    @ManyToOne(optional = false)
    private UserAdmin userAdminIdUseradmin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stroreIdStore")
    private List<UserSeller> userSellerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stroreIdStore")
    private List<UserClient> userClientList;

    public Strore() {
    }

    public Strore(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public UserAdmin getUserAdminIdUseradmin() {
        return userAdminIdUseradmin;
    }

    public void setUserAdminIdUseradmin(UserAdmin userAdminIdUseradmin) {
        this.userAdminIdUseradmin = userAdminIdUseradmin;
    }

    public List<UserSeller> getUserSellerList() {
        return userSellerList;
    }

    public void setUserSellerList(List<UserSeller> userSellerList) {
        this.userSellerList = userSellerList;
    }

    public List<UserClient> getUserClientList() {
        return userClientList;
    }

    public void setUserClientList(List<UserClient> userClientList) {
        this.userClientList = userClientList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStore != null ? idStore.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Strore)) {
            return false;
        }
        Strore other = (Strore) object;
        if ((this.idStore == null && other.idStore != null) || (this.idStore != null && !this.idStore.equals(other.idStore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Strore[ idStore=" + idStore + " ]";
    }
    
}
