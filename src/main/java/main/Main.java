package main;

import main.service.HelloWorldService;
import main.service.WrapService;
import springframework.context.ApplicationContext;
import springframework.context.ClassPathXmlApplicationContext;

/**
 * Created by xieli on 2021/3/10.
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        WrapService wrapService = (WrapService) applicationContext.getBean("wrapService");
//        wrapService.say();
//        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
//        HelloWorldService helloWorldService2 = (HelloWorldService) applicationContext.getBean("helloWorldService");
//        System.out.println("prototype验证：" + (helloWorldService == helloWorldService2));
//        WrapService wrapService2 = (WrapService) applicationContext.getBean("wrapService");
//        System.out.println("singleton验证：" + (wrapService == wrapService2));

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-annotation.xml");
        WrapService wrapService = (WrapService) applicationContext.getBean("wrapService");
        wrapService.say();
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        HelloWorldService helloWorldService2 = (HelloWorldService) applicationContext.getBean("helloWorldService");
        System.out.println("prototype验证：" + (helloWorldService == helloWorldService2));
        WrapService wrapService2 = (WrapService) applicationContext.getBean("wrapService");
        System.out.println("singleton验证：" + (wrapService == wrapService2));
    }

}
