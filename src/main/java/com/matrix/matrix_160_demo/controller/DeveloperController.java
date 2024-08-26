package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.entity.Developer;
import com.matrix.matrix_160_demo.service.DeveloperService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
@RequestMapping("/developer")
public class DeveloperController {
    private final DeveloperService developerService;



    @GetMapping("{id}")
    public Developer getById(@PathVariable int id) {

        return developerService.findById(id);
    }


    @GetMapping
    public List<Developer> getList(){
        return developerService.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Developer add(@RequestBody Developer developer){
        return developerService.add(developer);
    }

    @PutMapping
    public Developer update(@RequestBody Developer developer){
        return developerService.update(developer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        developerService.delete(id);


    }
}
