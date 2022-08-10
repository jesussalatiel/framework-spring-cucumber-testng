package com.solution.mobile.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@Configuration
@ComponentScan({"com.solution.mobile", "com.solution.common"})
@PropertySource("classpath:/application.properties")
public class ContextConfiguration {
}
