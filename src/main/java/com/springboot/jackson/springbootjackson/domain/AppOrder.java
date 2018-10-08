package com.springboot.jackson.springbootjackson.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class AppOrder {
    private String code;
    @JsonFormat(pattern = "yyyy/MM/dd")
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
