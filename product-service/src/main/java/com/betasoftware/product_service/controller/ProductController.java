package com.betasoftware.product_service.controller;

import com.betasoftware.product_service.data.dto.request.ProductRequestDto;
import com.betasoftware.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {

    private  final ProductService productService;
    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDto productRequestDto){
        productService.createProduct(productRequestDto);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProduct(){
    return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> getProductById(@PathVariable String id){
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable String id){
        return ResponseEntity.ok(null);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> updateProductById(@PathVariable String id){
        return ResponseEntity.ok(null);
    }

}
