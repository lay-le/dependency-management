package com.oracle.ofm.cloud.qa.publisher;

/**
 * Created by layle on 5/1/15.
 */
public class HelloWorldService {
    public String sayHello (String who) {
        return "Hello World, " + who;
        //Comment out the line above and uncomment the line below for the fix in ServiceConsumer junit test
//        return "Hello World, " + StringUtils.trim(who);
    }
}
