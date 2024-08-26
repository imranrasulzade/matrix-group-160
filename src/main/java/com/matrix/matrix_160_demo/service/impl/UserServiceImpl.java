package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.entity.User;
import com.matrix.matrix_160_demo.repositories.UserRepository;
import com.matrix.matrix_160_demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public Optional<User> findById(Integer id){
        return userRepository.findById(id);

    }
    public User findByName(String name){
        return userRepository.findByName(name);
    }

    public User add(User user){
        return userRepository.save(user);

    }
    public User update(User user){
        return userRepository.save(user);
    }
    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}
