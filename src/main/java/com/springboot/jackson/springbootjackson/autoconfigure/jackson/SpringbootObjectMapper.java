package com.springboot.jackson.springbootjackson.autoconfigure.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by GANG CHEN on 2018/10/8.
 */


/*
 * 重写 ObjectMapper
 * */
public class SpringbootObjectMapper extends ObjectMapper {

    public SpringbootObjectMapper() {
        System.out.println("over write");
    }
}
