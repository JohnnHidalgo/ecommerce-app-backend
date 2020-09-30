package com.project.biasbackend.dao;

import com.project.biasbackend.domain.Permissions;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;


public interface PermissionRepository extends JpaAttributeConverter<Permissions,Integer> {

//    Permissions findPermissionbyPermission(int var1);
}
