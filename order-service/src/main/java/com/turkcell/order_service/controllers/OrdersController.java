package com.turkcell.order_service.controllers;

import com.turkcell.order_service.client.ProductClient;
import com.turkcell.order_service.entity.Order;
import io.github.teomanates.event.order.OrderCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
      //restclient
//    @LoadBalanced
//    private final RestClient restClient;
//
//    public OrdersController(RestClient.Builder restClientBuilder) {
//        restClient = restClientBuilder.baseUrl("http://localhost:8083").build();}

    private final ProductClient productClient;
    private final StreamBridge streamBridge;


    public OrdersController(ProductClient productClient, StreamBridge streamBridge) {
        this.productClient = productClient;
        this.streamBridge = streamBridge;
    }

    @GetMapping
    public String get(){

        // restclient
//       String response = restClient.get().uri("/api/v1/products").retrieve().body(String.class);
//        System.out.println("Product serviceden gelen cevap: " + response);

        // openfeign
//        String response = productClient.get();
//        System.out.println(response);

//        Order order = new Order(); artık bu işlemi common paketinde yapabiliriz.
//        order.setId("abc");

        OrderCreatedEvent orderCreatedEvent = new
                OrderCreatedEvent("abc123", LocalDate.now());


        streamBridge.send("orderCreatedFunction-out-0", orderCreatedEvent);

        return "Order service";
    }
}
