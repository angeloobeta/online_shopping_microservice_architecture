package com.betasoftware.orderservice;

import com.betasoftware.orderservice.data.dtos.request.OrderRequestDto;
import com.betasoftware.orderservice.repositories.OrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utils.OrderUtilsTest;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
@RequiredArgsConstructor
class OrderServiceApplicationTests {

    @Container
    static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer();

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private OrderRepository orderRepository;

    private final OrderUtilsTest orderUtilsTest;

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
        dynamicPropertyRegistry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
    }

    @Test
    void shouldCreateOrder() throws Exception {
        OrderRequestDto orderRequestDto = orderUtilsTest.getOrderRequest();
        String orderRequestString = objectMapper.writeValueAsString(orderRequestDto);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(orderRequestString))
                .andExpect(status().isCreated());
        Assertions.assertEquals(1, orderRepository.findAll().size());
    }

    @Test
    void shouldGetAllOrder() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/orders"));
    }


}
