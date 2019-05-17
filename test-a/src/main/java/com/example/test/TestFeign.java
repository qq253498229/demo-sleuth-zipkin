package com.example.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangbin
 */
@FeignClient("test-b")
public interface TestFeign {
    @GetMapping("/test")
    String test();

    @GetMapping("/b")
    String b();
}
