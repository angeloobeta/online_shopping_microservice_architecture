package com.betasoftware.product_service.controller;

import com.betasoftware.product_service.data.dto.request.ProductRequestDto;
import com.betasoftware.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private  final ProductService productService;
    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDto productRequestDto){
        productService.createProduct(productRequestDto);
    }

    @GetMapping("/allProduct")
    public ResponseEntity<?> getAllProduct(){
    return ResponseEntity.ok(productService.getAllProduct());
    }
}
