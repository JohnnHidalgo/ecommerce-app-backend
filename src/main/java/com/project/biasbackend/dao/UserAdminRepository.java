package com.project.biasbackend.dao;

import com.project.biasbackend.domain.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAdminRepository extends JpaRepository<UserAdmin,Integer> {
    UserAdmin findByIdUseradmin(int var1 );
}
