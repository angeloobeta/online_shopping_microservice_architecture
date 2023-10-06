package com.betasoftware.product_service.data.dto.response;

import lombok.*;

@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class ApiResponseDto <T>{
    private String message;
    private Integer statusCode;
    private T data;
}
