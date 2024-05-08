package org.example;

import org.example.bean.Greeting;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Greeting greeting = context.getBean(Greeting.class);
        greeting.setMessage("Hello Friends");
        greeting.startGreeting();

        context.close();
    }
}