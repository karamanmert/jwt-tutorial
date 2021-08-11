package com.mertkaraman.jwttutorial.repository;

import com.mertkaraman.jwttutorial.model.Role;
import com.mertkaraman.jwttutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
