package com.betasoftware.orderservice.controller;

import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import com.betasoftware.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequestDto orderRequestDto){
         orderService.placeOrder(orderRequestDto);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/orders")
    public ResponseEntity<?> getAllOrder(){
        return ResponseEntity.ok(null);
    }

    @GetMapping("/orders/{Id}")
    public ResponseEntity<?> getOrderById(@PathVariable String Id){
        return ResponseEntity.ok(null);
    }

    @PutMapping("/orders/{Id}")
    public ResponseEntity<?> updateOrderById( @PathVariable String Id){
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/orders/{Id}")
    public ResponseEntity<?> deleteOrderById( @PathVariable String Id){
        return ResponseEntity.ok(null);
    }
}
