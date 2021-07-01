package com.example.truongminhquancsw.service;

import com.example.truongminhquancsw.entity.ProductEntity;
import com.example.truongminhquancsw.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity addProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public ProductEntity sellProduct(int productId, int quantity) {
        ProductEntity productEntity = productRepo.getById(productId);
        productEntity.setQuantity(quantity);
        return productRepo.save(productEntity);
    }
}
