package com.my.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.domain.User;



public interface UserRepository extends JpaRepository<User, Integer>{
}
