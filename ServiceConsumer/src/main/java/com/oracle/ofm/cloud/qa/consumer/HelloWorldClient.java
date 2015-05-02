package com.oracle.ofm.cloud.qa.consumer;


import com.oracle.ofm.cloud.qa.publisher.HelloWorldService;

/**
 * Created by layle on 4/30/15.
 */
public class HelloWorldClient {
    public String sayHello(String who) {
        HelloWorldService helloWorldService = new HelloWorldService();
        return helloWorldService.sayHello(who);
    }
}
