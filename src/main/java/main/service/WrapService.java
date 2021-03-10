package main.service;

/**
 * Created by xieli on 2021/3/10.
 */
public class WrapService {

    private HelloWorldService helloWorldService;

    public void say() {
        helloWorldService.saySomething();
    }

}
