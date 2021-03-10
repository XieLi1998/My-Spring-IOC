package main.service;

import springframework.annotation.Component;
import springframework.annotation.Scope;
import springframework.annotation.Value;

/**
 * Created by xieli on 2021/3/10.
 */


@Component(name = "helloWorldService")
@Scope("prototype")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Value("Hello, world")
    private String text;

    @Override
    public void saySomething() {
        System.out.println(text);
    }
}
