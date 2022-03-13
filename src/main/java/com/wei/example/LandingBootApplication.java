package com.wei.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.wei.example"})
@ComponentScan(basePackages = "com.wei.example")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
//@ImportResource({"classpath*:dataSource-jta.xml", "classpath*:dataAccessContext.xml"})
public class LandingBootApplication extends SpringBootServletInitializer {

    public static final String QueueName = "testQ";

    public static void main(String[] args) {
        SpringApplication.run(LandingBootApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(LandingBootApplication.class);
//    }


}