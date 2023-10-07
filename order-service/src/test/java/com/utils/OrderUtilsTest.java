package com.utils;

import com.betasoftware.orderservice.data.dtos.request.OrderLineItemsRequestDto;
import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class OrderUtilsTest {

    public OrderRequestDto getOrderRequest(){

    List<OrderLineItemsRequestDto> orderRequestDto =  new OrderRequestDto()
            .getOrderLineItems()
            .stream()
            .map(orderLineItemsRequestDto ->
                    OrderLineItemsRequestDto.builder()
                            .skuCode("_3413")
                            .quantity(23)
                            .price(BigDecimal.valueOf(9018))
                            .build()).toList();


    return OrderRequestDto.builder()
            .orderLineItems(orderRequestDto)
            .build();

}
}
