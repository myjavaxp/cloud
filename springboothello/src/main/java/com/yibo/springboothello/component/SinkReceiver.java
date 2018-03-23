package com.yibo.springboothello.component;

import com.yibo.springboothello.SpringBootHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class SinkReceiver {
    private static final Logger LOGGER= LoggerFactory.getLogger(SpringBootHelloApplication.class);
    @StreamListener(Sink.INPUT)
    public void receiver(Object payload){
        LOGGER.info("Received:"+payload);
    }
}