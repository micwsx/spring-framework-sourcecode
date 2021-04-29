package com.enjoy.beans.aop;

import java.lang.annotation.*;

/**
 * @Author wu
 * @Date 4/11/2021 4:22 PM
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface EnhanceAnnotation {

	String name() default "";
}
