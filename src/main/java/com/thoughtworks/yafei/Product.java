package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;

    public int getAmount() {
        return amount;
    }

    @Value("1")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    @Value("chocolate")
    public void setName(String name) {
        this.name = name;
    }

    private int amount;

    @Override
    public String toString() {
        return name;
    }
}
