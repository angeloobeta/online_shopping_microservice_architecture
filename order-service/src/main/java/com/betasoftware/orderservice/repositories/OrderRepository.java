package com.betasoftware.orderservice.repositories;

import com.betasoftware.orderservice.data.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
