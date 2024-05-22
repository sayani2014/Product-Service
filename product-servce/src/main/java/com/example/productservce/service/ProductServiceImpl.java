package com.example.productservce.service;

import com.example.productservce.dto.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{
    @Override
    public Product getById(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    private static List<Product> products = Arrays.asList(
            new Product("1", "Product1", "Organisation1"),
            new Product("2", "Product2", "Organisation2"),
            new Product("3", "Product3", "Organisation3")
    );
}
