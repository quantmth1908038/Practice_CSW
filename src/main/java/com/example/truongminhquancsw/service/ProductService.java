package com.example.truongminhquancsw.service;

import com.example.truongminhquancsw.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity p);
    ProductEntity sellProduct(int productId, int quantity);
}
