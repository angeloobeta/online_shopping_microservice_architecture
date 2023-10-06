package com.betasoftware.product_service.service;

import com.betasoftware.product_service.data.dto.request.ProductRequestDto;
import com.betasoftware.product_service.data.dto.response.ApiResponseDto;
import com.betasoftware.product_service.data.dto.response.ProductResponseDto;
import com.betasoftware.product_service.data.entities.Product;
import com.betasoftware.product_service.data.repositories.ProductRepository;
import com.betasoftware.product_service.utils.ProductUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{

    private  final ProductRepository productRepository;
    private final ProductUtils productUtils;

    @Override
    public void createProduct(ProductRequestDto productRequestDto) {
        Product product = Product.builder()
                .productName(productRequestDto.getProductName())
                .productDescription(productRequestDto.getProductDescription())
                .productPrice(productRequestDto.getProductPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} successfully added", product.getProductId());
    }

    @Override
    public ApiResponseDto<List<ProductResponseDto>> getAllProduct() {
        List<ProductResponseDto> productList = productRepository.findAll().stream()
                .map(productUtils::mapProductToDto).toList();
        return new ApiResponseDto<>("All Product successfully fetched", 200, productList);
    }
}
