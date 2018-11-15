package com.example.springboottest.aspect;

import org.springframework.core.annotation.Order;

// AOP切面：多个切面，@Order(i)注解来标识切面的优先级 i的值越少，优先级越高
@Order(5)
public class MyAspect {
	
}
