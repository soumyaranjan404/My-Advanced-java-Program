package com.configu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan({"com.car","com.Driver"})
@Configuration
@PropertySource("classpath:application.properties")
public class Config {

}
