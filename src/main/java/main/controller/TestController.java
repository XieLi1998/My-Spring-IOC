package main.controller;

import main.service.HelloWorldService;
import springframework.annotation.Autowired;
import springframework.annotation.Controller;
import springframework.annotation.RequestMapping;
import springframework.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xieli on 2021/3/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("param") String param) {
        try {
            String text = helloWorldService.getString();
            response.getWriter().write(text + " and the param is " + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
