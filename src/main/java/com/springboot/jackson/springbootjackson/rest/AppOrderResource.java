package com.springboot.jackson.springbootjackson.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.jackson.springbootjackson.domain.AppOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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


    /**
     * 关于时间格式化的转换
     * */
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

    /**
     * 时间格式化的转化
     * */
    public void test1(){
        LocalDateTime rightNow=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter_iso= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String rightNow_str= dateTimeFormatter_iso.format(rightNow);
        System.out.println(rightNow_str);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        String rightNow_str1=dateTimeFormatter1.format(rightNow);
        System.out.println(rightNow_str1);
    }
}
