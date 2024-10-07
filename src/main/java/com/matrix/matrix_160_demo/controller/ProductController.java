package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.entity.Product;
import com.matrix.matrix_160_demo.service.ProductService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;


    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PostMapping
    public Product add(@RequestParam Product product) {
        return productService.add(product);
    }


    @PutMapping
    public Product update(@RequestParam Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(Integer id) {
        productService.delete(id);
    }

    @GetMapping
    public List<Product> getList() {
        return productService.getList();
    }

    @GetMapping("/filter")
    public List<Product> getFiltered(@RequestParam Optional<String> branch,
                                     @RequestParam Optional<String> colour,
                                     @RequestParam Optional<String> status){
        return productService.getFiltered(branch, colour, status);
    }

}
