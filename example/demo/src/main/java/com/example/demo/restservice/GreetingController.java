package com.example.demo.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //标记下面的所有方法都返回一个域对象（？）而不是视图
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //GetMapping确保Http的get请求映射到greeting方法
    public Greeting greeting(@RequestParam(value = "name" , defaultValue = "World") String name) {//把name绑定到greeting方法中的name参数中去，如果name不存在，就使用defaulvalue
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
        //这将会返回一个新的greeting对象，并且使用greeting的模板格式化给定的名称。
    }
    
}
