package com.smart.SmartContact.Entities.dao;

import com.smart.SmartContact.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
