package com.betasoftware.product_service.data.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class ProductResponseDto {
    private String productId;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
}
