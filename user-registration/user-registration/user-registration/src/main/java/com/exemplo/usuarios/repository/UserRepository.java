package com.exemplo.usuarios.repository;

import com.exemplo.usuarios.model.User;
import java.util.*;

public class UserRepository {
    private Map<String, User> database = new HashMap<>();

    public void save(User user) {
        database.put(user.getId(), user);
    }

    public User findById(String id) {
        return database.get(id);
    }

    public void delete(String id) {
        database.remove(id);
    }

    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }
}