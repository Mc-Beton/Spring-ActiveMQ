package com.kodilla.ordermessager.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {
    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void receive(String order) {
        System.out.println("Received the message: " + order);
    }

}
