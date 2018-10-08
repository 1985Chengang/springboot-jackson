package com.springboot.jackson.springbootjackson.config;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.springboot.jackson.springbootjackson.autoconfigure.jackson.SpringbootObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JacksonConfiguration {
    @Bean
    @Primary
    public SpringbootObjectMapper SpringbootObjectMapper(){
        return new SpringbootObjectMapper();
    }

    /**
     * Support for Java date and time API.
     * @return the corresponding Jackson module.
     */
    /*@Bean
    public JavaTimeModule javaTimeModule() {
        return new JavaTimeModule();
    }

    @Bean
    public Jdk8Module jdk8TimeModule() {
        return new Jdk8Module();
    }*/
}
