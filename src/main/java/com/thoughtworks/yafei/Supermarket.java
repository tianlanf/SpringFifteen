package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Supermarket {
    private Product product;
    private int amount;

    @Value("#{product}")
    public void setProduct(Product product) {
        this.product = product;
    }

    @Value("#{product.amount}")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "The most popular product of this supermarket is " + product.toString() + " and the amount is " + amount;
    }
}
