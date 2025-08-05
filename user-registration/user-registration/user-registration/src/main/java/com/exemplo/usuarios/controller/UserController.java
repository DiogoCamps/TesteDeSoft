package com.exemplo.usuarios.controller;

import com.exemplo.usuarios.model.User;
import com.exemplo.usuarios.service.UserService;

import java.util.List;

public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public void createUser(String id, String name) {
        service.registerUser(id, name);
    }

    public User findUser(String id) {
        return service.getUser(id);
    }

    public List<User> getAllUsers() {
        return service.listUsers();
    }

    public void removeUser(String id) {
        service.deleteUser(id);
    }
}