package com.betasoftware.product_service.utils;

import com.betasoftware.product_service.data.dto.response.ProductResponseDto;
import com.betasoftware.product_service.data.entities.Product;
import org.springframework.stereotype.Component;

@Component public class ProductUtils {
    public ProductResponseDto mapProductToDto(Product product) {
        return ProductResponseDto.builder()
                .productDescription(product.getProductDescription())
                .productId(product.getProductId())
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .build();
    }
}
