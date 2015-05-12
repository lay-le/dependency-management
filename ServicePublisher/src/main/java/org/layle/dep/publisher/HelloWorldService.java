package org.layle.dep.publisher;

/**
 * Created by layle on 5/1/15.
 */
public class HelloWorldService {
    public String sayHello (String who) {
        return "Hello World, " + who;
        //Comment out the line above and uncomment the line below for the fix in ServiceConsumer junit test
        //also add "import org.apache.commons.lang3.StringUtils;"
//        return "Hello World, " + StringUtils.trim(who);
    }
}
