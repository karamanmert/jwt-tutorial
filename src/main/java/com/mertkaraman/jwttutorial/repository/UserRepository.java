package com.mertkaraman.jwttutorial.repository;

import com.mertkaraman.jwttutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
