package com.betasoftware.orderservice.data.dtos.request;

import com.betasoftware.orderservice.data.entities.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class OrderRequestDto {
    private List<OrderLineItemsRequestDto> orderLineItems;

}
