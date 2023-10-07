package com.betasoftware.orderservice.service;

import com.betasoftware.orderservice.data.dtos.request.OrderLineItemsRequestDto;
import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import com.betasoftware.orderservice.data.entities.Order;
import com.betasoftware.orderservice.data.entities.OrderLineItems;
import com.betasoftware.orderservice.repositories.OrderRepository;
import com.betasoftware.orderservice.utils.OrderUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements  OrderService{

    private final OrderUtils orderUtils;
    private final OrderRepository orderRepository;
    @Override
    public void placeOrder(OrderRequestDto orderRequestDto) {
        List<OrderLineItems> orderLineItems = orderRequestDto
                .getOrderLineItems()
                .stream()
                .map(orderUtils::mapOrderLineItemToDto).toList();
        Order order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .orderLineItemsList(orderLineItems)
                .build();
        orderRepository.save(order);
    }
}
