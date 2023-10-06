package com.betasoftware.orderservice.utils;

import com.betasoftware.orderservice.data.dtos.request.OrderLineItemsRequestDto;
import com.betasoftware.orderservice.data.entities.OrderLineItems;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrderUtils {

    public OrderLineItems mapOrderLineItemToDto(OrderLineItemsRequestDto orderLineItemsRequestDto){
        return OrderLineItems.builder()
                .id(orderLineItemsRequestDto.getId())
                .price(orderLineItemsRequestDto.getPrice())
                .quantity(orderLineItemsRequestDto.getQuantity())
                .skuCode(orderLineItemsRequestDto.getSkuCode())
                .build();
    }
}
