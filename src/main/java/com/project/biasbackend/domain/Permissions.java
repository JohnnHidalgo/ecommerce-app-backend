package com.project.biasbackend.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "permissions")
@NamedQueries({
    @NamedQuery(name = "Permissions.findAll", query = "SELECT p FROM Permissions p"),
    @NamedQuery(name = "Permissions.findByPermissions", query = "SELECT p FROM Permissions p WHERE p.permissions = :permissions"),
    @NamedQuery(name = "Permissions.findByPermissionName", query = "SELECT p FROM Permissions p WHERE p.permissionName = :permissionName")})
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "permissions")
    private Integer permissions;
    @Basic(optional = false)
    @Column(name = "permission_name")
    private String permissionName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissionsPermissions")
    private List<PermissionUserSeller> permissionUserSellerList;

    public Permissions() {
    }

    public Permissions(Integer permissions) {
        this.permissions = permissions;
    }

    public Permissions(Integer permissions, String permissionName) {
        this.permissions = permissions;
        this.permissionName = permissionName;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<PermissionUserSeller> getPermissionUserSellerList() {
        return permissionUserSellerList;
    }

    public void setPermissionUserSellerList(List<PermissionUserSeller> permissionUserSellerList) {
        this.permissionUserSellerList = permissionUserSellerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissions != null ? permissions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions other = (Permissions) object;
        if ((this.permissions == null && other.permissions != null) || (this.permissions != null && !this.permissions.equals(other.permissions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Permissions[ permissions=" + permissions + " ]";
    }
    
}
