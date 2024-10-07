package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);

    Optional<User> findByUsername(String username);

}
