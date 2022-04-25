package com.kodilla.ordermessager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class OrderMessegerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMessegerApplication.class, args);
    }

}
