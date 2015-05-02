package com.oracle.ofm.cloud.qa.consumer;


import org.testng.annotations.Test;

import static org.testng.Assert.fail;

/**
 * Created by layle on 5/1/15.
 */
public class HelloWorldClientTest {
    @Test(groups = "TestHelloWorld")
    void testHelloWorld() {
        HelloWorldClient helloWorldClient = new HelloWorldClient();
        String msg = helloWorldClient.sayHello(" Lay ");
        System.out.println("Response Message: " + msg);
        fail("Just fail");
    }

}
