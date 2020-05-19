package com.enjoy.startup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(
		basePackages = {"com.enjoy"},
		excludeFilters = {
				@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
		})
public class SpringAnnotationConfig {
}
