package com.betasoftware.product_service.service;

import com.betasoftware.product_service.data.dto.request.ProductRequestDto;
import com.betasoftware.product_service.data.dto.response.ApiResponseDto;
import com.betasoftware.product_service.data.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequestDto productRequestDto);

    ApiResponseDto<List<ProductResponseDto>> getAllProduct();

}
