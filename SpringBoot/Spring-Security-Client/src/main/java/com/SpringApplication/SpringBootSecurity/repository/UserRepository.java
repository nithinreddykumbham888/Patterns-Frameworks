package com.SpringApplication.SpringBootSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringApplication.SpringBootSecurity.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
