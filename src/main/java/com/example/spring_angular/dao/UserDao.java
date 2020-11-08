package com.example.spring_angular.dao;

import com.example.spring_angular.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
