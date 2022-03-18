package com.wei.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SpringBootApplication
//@ImportResource({"classpath*:dataSource-jdbc.xml"})
@PropertySource("classpath:application.properties")
public class LandingBootTestApplication {
}
