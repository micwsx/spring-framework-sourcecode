package com.enjoy.beans.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author wu
 * @Date 4/11/2021 3:48 PM
 * @Version 1.0
 */
// proxyTargetClass：默认false（使用JDK动态代理）
// exposeProxy: true(可以通过AopContext访问拿到代理对象)
@EnableAspectJAutoProxy(proxyTargetClass = false, exposeProxy = true)
@Component
public class AopConfig {

}
