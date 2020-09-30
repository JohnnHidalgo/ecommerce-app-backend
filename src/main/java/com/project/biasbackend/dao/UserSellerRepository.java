package com.project.biasbackend.dao;

import com.project.biasbackend.domain.UserSeller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSellerRepository extends JpaRepository<UserSeller,Integer> {

    UserSeller findByIdUserseller(int var1);
}
