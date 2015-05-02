package com.oracle.ofm.cloud.qa.publisher;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by layle on 5/1/15.
 */
public class HelloWorldService {
    public String sayHello (String who) {
        return "Hello World! " + StringUtils.trim(who);
    }
}
