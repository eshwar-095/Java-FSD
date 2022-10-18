package com.demo.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}