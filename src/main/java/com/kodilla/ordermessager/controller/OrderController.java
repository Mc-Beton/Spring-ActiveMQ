package com.kodilla.ordermessager.controller;

import com.kodilla.ordermessager.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void processMessage(@RequestBody Order order) {
        System.out.println(order);
        jmsTemplate.convertAndSend("queue-test", "Order created for User " + order.getUser());
    }
}
