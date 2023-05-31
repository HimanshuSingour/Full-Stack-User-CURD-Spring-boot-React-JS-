package com.angular.learn.users.UserService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.learn.users.UserService.Entities.User;

public interface Repositories extends JpaRepository<User, Integer>{

}
