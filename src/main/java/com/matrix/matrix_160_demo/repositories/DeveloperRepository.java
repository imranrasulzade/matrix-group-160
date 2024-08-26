package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer,Integer> {


}
