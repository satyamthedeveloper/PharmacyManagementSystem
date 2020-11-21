package com.cts.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.user.model.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}
