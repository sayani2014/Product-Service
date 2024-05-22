package com.example.productservce.service;

import com.example.productservce.dto.Product;

public interface IProductService {
    Product getById(String id);
}
