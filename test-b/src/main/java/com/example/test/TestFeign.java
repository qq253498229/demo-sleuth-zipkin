package com.example.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangbin
 */
@FeignClient("test-a")
public interface TestFeign {
    @GetMapping("/a")
    String a();
}
