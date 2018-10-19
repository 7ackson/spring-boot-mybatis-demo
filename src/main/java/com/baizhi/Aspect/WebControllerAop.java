package com.baizhi.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WebControllerAop {
    @Pointcut("execution(* com.baizhi.service.*.*(..))")
    public void executeService(){}

    @Before(value = "executeService()")
    public void  BeforeTest(){
        System.out.println("前置注入");
        System.out.println("测试git");
    }

    @After(value = "executeService()")
    public void AfterTest(){
        System.out.println("后置注入");
    }

    @Around("execution(* com.baizhi.dao.*.*(..))")
    public void AroundTest(){
        System.out.println("环绕注入");
    }

}
