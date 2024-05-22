package com.example.productservce.dto;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    String id;
    String name;
    String organisation;
}
