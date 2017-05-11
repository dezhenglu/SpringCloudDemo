package com.ludzh.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ludz on 2017/5/11/011.
 */
@RestController
public class Consumer {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.
                getForEntity("http://HELLO-SERVICE:1111/hello",String.class).getBody();
    }
}
