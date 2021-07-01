package com.example.truongminhquancsw.controller;

import com.example.truongminhquancsw.entity.ProductEntity;
import com.example.truongminhquancsw.mode.BaseResponse;
import com.example.truongminhquancsw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity getAllProduct() {
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProducts();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.addProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateSellProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.sellProduct(p.getId(), p.getQuantity());
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
