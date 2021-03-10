package main.service;

/**
 * Created by xieli on 2021/3/10.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private String text;

    @Override
    public void saySomething() {
        System.out.println(text);
    }
}
