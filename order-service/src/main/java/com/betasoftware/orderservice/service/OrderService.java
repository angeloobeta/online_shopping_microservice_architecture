package com.betasoftware.orderservice.service;

import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface OrderService {
    public void placeOrder(OrderRequestDto orderRequestDto);
}
