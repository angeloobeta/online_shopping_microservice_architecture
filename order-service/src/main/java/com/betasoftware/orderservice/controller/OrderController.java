package com.betasoftware.orderservice.controller;

import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import com.betasoftware.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping()
    public ResponseEntity<?> getOrder(@RequestBody OrderRequestDto orderRequestDto){
         orderService.placeOrder(orderRequestDto);
        return null;
    }
}
