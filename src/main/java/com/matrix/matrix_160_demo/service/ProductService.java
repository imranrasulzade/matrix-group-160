package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.entity.Product;

import java.util.List;

public interface ProductService {

    Product getById(Integer id);

    Product add(Product product);

    Product update(Product product);

    void delete(Integer id);

    List<Product> getList();
}
