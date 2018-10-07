package com.springboot.jackson.springbootjackson.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.springboot.jackson.springbootjackson.domain.AppOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class AppOrderResource {

    @GetMapping("/app-order/{code}")
    public ResponseEntity<AppOrder> getAppOrder(@PathVariable Long code)
    {
        AppOrder appOrder = new AppOrder();
        appOrder.setCode("1000000");
        appOrder.setPlaceOrderDate(LocalDate.now());
        test();
        return ResponseEntity.ok().body(appOrder);
    }

    public void test(){
        AppOrder appOrder = new AppOrder();
        appOrder.setCode("1000002");
        appOrder.setPlaceOrderDate(LocalDate.now());

        ObjectMapper objectMapper = new ObjectMapper();
        /*objectMapper.registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());*/
        try {
            String appOrderJson = objectMapper.writeValueAsString(appOrder);
            System.out.println(appOrderJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
