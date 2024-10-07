package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.entity.Product;
import com.matrix.matrix_160_demo.repositories.ProductRepository;
import com.matrix.matrix_160_demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override

    public Product getById(Integer id) {
        return productRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getList() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getFiltered(Optional<String> branch, Optional<String> colour, Optional<String> status) {
        return null;
    }
}
