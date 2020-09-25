package com.project.biasbackend.dao;

import com.project.biasbackend.domain.PermissionUserSeller;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface PermissionsUserSellerRepository extends JpaAttributeConverter<PermissionUserSeller, Integer> {

    PermissionUserSeller findPermissionUserSellerbyidPermissionUserSeller( int var1 );
}
