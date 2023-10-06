package com.betasoftware.orderservice.data.dtos.request;

import com.betasoftware.orderservice.data.entities.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OrderRequestDto {
    private List<OrderLineItemsRequestDto> orderLineItems;

}
