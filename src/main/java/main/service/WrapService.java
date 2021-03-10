package main.service;

import springframework.annotation.Autowired;
import springframework.annotation.Component;

/**
 * Created by xieli on 2021/3/10.
 */

@Component(name = "wrapService")
public class WrapService {

    @Autowired
    private HelloWorldService helloWorldService;

    public void say() {
        helloWorldService.saySomething();
    }

}
