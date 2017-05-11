package com.ludzh.ctrl;

import com.ludzh.ctrl.entity.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ludz on 2017/5/10/010.
 */
@RestController
public class HelloController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){

        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        log.info("/hello, host:" + serviceInstance.getHost() +
                ", service_id:" + serviceInstance.getServiceId());

        return "Hello world";
    }

    @Autowired
    MyComponent component;

    @RequestMapping("/testprops")
    public String testprops(){
        return component.toString();
    }
}
