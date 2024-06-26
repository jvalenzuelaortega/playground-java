package org.example.config;

import org.example.bean.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Greeting getGreeting(){
        return new Greeting("hello");
    }
}
