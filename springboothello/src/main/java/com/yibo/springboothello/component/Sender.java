package com.yibo.springboothello.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Sender {
    @Resource
    private AmqpTemplate amqpTemplate;
    private static final Logger LOGGER= LoggerFactory.getLogger(Sender.class);
    public void send(){
        String context="hello "+new Date();
        LOGGER.info("Sender: "+context);
        amqpTemplate.convertAndSend("hello",context);
    }
}