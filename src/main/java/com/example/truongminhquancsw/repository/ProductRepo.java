package com.example.truongminhquancsw.repository;

import com.example.truongminhquancsw.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
