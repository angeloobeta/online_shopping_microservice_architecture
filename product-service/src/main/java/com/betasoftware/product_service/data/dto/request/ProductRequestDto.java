package com.betasoftware.product_service.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class ProductRequestDto {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
}
