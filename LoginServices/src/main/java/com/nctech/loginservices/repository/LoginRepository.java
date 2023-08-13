package com.nctech.loginservices.repository;

import com.nctech.loginservices.entities.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

//    // Custom query method to find a login entity by username
//    Optional<LoginEntity> findByUserName(String userName);
//
//    // Custom query method to find login entities by password
//    List<LoginEntity> findByPassword(String password);
//
//    // Add more custom query methods if needed
}
