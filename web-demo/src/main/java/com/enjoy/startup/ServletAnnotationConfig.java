package com.enjoy.startup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/* @EnableWebMvc注解导入 RequestMappingHandlerMapping.afterPropertiesSet()方法时会解析每个BeanDefinition中是否有Controller注解并获取RequestMapping注解方法。
* 如果@EnableWebMvc注解添加在Spring配置类中，并且没有加@Configuration，则不会扫描Controller中RequestMapping方法。
* 因为Spring首先会注册Spring配置类BeanDefinition并解析配置类注解，此时Spring配置类中有的命名空间是com.enjoy，排除了Controller注解修饰类，但并不会排除@Configuration注解修饰类。
* 若没有@Configuration注解则，@EnableWebMvc导入RequestMappingHandlerMapping初始化Bean时就不会解析到Controller中RequestMapping方法。
* 若添加@Configuration注解，在扫描时会扫描这个类并再解析@ComponentScan注解，并扫描basePackages中的Controller中RequestMapping方法，然后再解析SpringMVC配置类重复解析了。
* 所以建议还是在SpringMVC配置类中添加@EnableWebMvc注解，则Controller类先被注册后(@ComponentScan优先于@Import)，@EnableWebMvc注解随后就能扫描Controller类中的RequestMapping方法。
* Spring解析类顺序是
* 	1.@Component,@Configuration,@Service等继承@Compoent注解
* 	2.@PropertySource
*   3.@ComponentScan,解析Spring配置中的ComponentScan注解去解析此类中的ComponentScan注解（因为有@Configuration注解，下面代码能扫描到此类）
* 		Set<BeanDefinitionHolder> scannedBeanDefinitions = this.componentScanParser.parse(componentScan, sourceClass.getMetadata().getClassName());
* 	4.@Import
* 	5.@ImportResource
* 	6.@Bean
* 	7.Supper Class
*
* */
@Configuration
//添加@EnableWebMvc注解，则不用再添加@Configuration注解。也可以扫描Controller中RequestMapping方法。
@EnableWebMvc
@ComponentScan(
		basePackages = {"com.enjoy.controller"})
public class ServletAnnotationConfig {
}

