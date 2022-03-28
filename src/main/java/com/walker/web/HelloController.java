package com.walker.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        log.trace("测试{}，日志级别{}，输出{}", "demo1", "trace", "trace level log");

        log.debug("测试{}，日志级别{}，输出{}", "demo1", "debug", "debug level log");

        log.info("测试{}，日志级别{}，输出{}", "demo1", "info", "info level log");

        log.warn("测试{}，日志级别{}，输出{}", "demo1", "warn", "warn level log");

        log.error("测试{}，日志级别{}，输出{}", "demo1", "error", "error level log");
        return "Hello Spring Boot";
    }

}
