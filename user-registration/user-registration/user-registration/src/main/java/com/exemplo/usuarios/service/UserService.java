package com.exemplo.usuarios.service;

import com.exemplo.usuarios.model.User;
import com.exemplo.usuarios.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String id, String name) {
        User user = new User(id, name);
        repository.save(user);
    }

    public User getUser(String id) {
        return repository.findById(id);
    }

    public List<User> listUsers() {
        return repository.findAll();
    }

    public void deleteUser(String id) {
        repository.delete(id);
    }
}