package com.turkcell.cartservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("carts")
public class Cart {
    @Id
    private String id;
    public String customerFullName;
    private float totalPrice;

    public Cart() {
    }

    public Cart(String id, String customerFullName, float totalPrice) {
        this.id = id;
        this.customerFullName = customerFullName;
        this.totalPrice = totalPrice;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getId() {
        return id;
    }

}
