package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.model.entity.Lawyer;
import com.matrix.matrix_160_demo.service.LawyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lawyer")
public class LawyerController {
    private final LawyerService lawyerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Lawyer add(@RequestBody Lawyer lawyer) {
        return lawyerService.add(lawyer);
    }

    @GetMapping({"/id"})
    public Lawyer findById(@PathVariable Integer id) {
        return lawyerService.findById(id);
    }

    @PutMapping
    public Lawyer update(@RequestBody Lawyer lawyer) {
        return lawyerService.update(lawyer);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        lawyerService.delete(id);
    }
}
