package io.github.teomanates.event.order;

import java.time.LocalDate;

public class OrderCreatedEvent {
    private String orderId;
    private LocalDate orderDate;

    public OrderCreatedEvent() {

    }

    public OrderCreatedEvent(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
