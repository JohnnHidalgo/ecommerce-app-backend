package com.project.biasbackend.dao;

import com.project.biasbackend.domain.UserAdmin;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface UserAdminRepository extends JpaAttributeConverter<UserAdmin,Integer> {
     UserAdmin findUserAdminbyidUserAdmin(int var1 );
}
