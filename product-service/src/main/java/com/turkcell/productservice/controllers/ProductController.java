package com.turkcell.productservice.controllers;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @GetMapping
    public String get() {
        System.out.println("processing");
        return "Product service";
    }
}
