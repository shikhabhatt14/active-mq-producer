package com.example.producer.service;

import jakarta.jms.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    /*@Autowired
    private Queue queue;*/

    private static final String QUEUE_NAME = "testQueue";

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(QUEUE_NAME, message);
    }
}
