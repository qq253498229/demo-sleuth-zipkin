package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangbin
 */
@RestController
public class TestController {
    @Resource
    private TestFeign testFeign;

    @GetMapping("/test")
    public String test() {
        return testFeign.a();
    }

    @GetMapping("/b")
    public String b() {
        throw new RuntimeException("错啦错啦");
    }
}
