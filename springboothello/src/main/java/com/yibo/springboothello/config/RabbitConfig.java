package com.yibo.springboothello.config;

import org.springframework.amqp.core.Queue;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
    @Bean
    public Sampler defaultSampler(){
        return new AlwaysSampler();
    }
}