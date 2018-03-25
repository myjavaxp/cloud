package com.yibo.springboothello;

import com.yibo.springboothello.component.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootHelloApplicationTest {
    @Resource
    private Sender sender;
    @Test
    public void hello(){
        sender.send();
    }
}