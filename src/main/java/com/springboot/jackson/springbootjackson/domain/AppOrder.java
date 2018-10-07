package com.springboot.jackson.springbootjackson.domain;

import java.time.LocalDate;

public class AppOrder {
    private String code;
    private LocalDate placeOrderDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getPlaceOrderDate() {
        return placeOrderDate;
    }

    public void setPlaceOrderDate(LocalDate placeOrderDate) {
        this.placeOrderDate = placeOrderDate;
    }
}
