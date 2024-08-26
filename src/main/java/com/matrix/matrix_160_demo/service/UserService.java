package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.entity.User;

import java.util.Optional;

public interface UserService {
     Optional<User> findById(Integer id);
     User findByName(String name);
    public User add(User user);
    public User update(User user);
    public void delete(Integer id);
}
