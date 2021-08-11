package com.mertkaraman.jwttutorial.service;

import com.mertkaraman.jwttutorial.model.Role;
import com.mertkaraman.jwttutorial.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName); //username has to be different..
    User getUser(String username);
    List<User> getUsers(); //in real life, if we do this, all db will come... ONLY RETURN A PAGE.. If you have 500 users, give me 10..
}
