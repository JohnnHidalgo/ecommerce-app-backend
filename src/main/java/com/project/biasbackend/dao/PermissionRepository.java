package com.project.biasbackend.dao;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import java.security.Permission;

public interface PermissionRepository extends JpaAttributeConverter<Permission,Integer> {

    Permission findPermissionbyPermission(int var1);
}
