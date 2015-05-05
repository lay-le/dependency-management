package com.oracle.ofm.cloud.qa.consumer;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by layle on 5/1/15.
 */
public class HelloWorldClientTest {
    /**
     * Test ServicePublisher.sayHello with no leading, trailing spaces in name
     */
    @Test
    public void testHelloWorld1() {
        HelloWorldClient helloWorldClient = new HelloWorldClient();
        String msg = helloWorldClient.sayHello("Gradle");
        System.out.println("Response Message: " + msg);
        Assert.assertEquals("HelloWorld message", "Hello World, Gradle", msg);
    }

    /**
     * Test ServicePublisher.sayHello with leading, trailing spaces in name
     */
    @Test
    public void testHelloWorld2() {
        HelloWorldClient helloWorldClient = new HelloWorldClient();
        String msg = helloWorldClient.sayHello(" Gradle ");
        System.out.println("Response Message: " + msg);
        Assert.assertEquals("HelloWorld message", "Hello World, Gradle", msg);
    }

}
