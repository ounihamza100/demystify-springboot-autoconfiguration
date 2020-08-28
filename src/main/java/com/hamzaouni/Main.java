package com.hamzaouni;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Main {


    @Configuration
    public static class MyAppConfig {
        @Bean
        public TomcatLauncher tomcatLauncher(){
            return new TomcatLauncher();
        }
    }
    public static void main(String[] args) {

         new AnnotationConfigApplicationContext(MyAppConfig.class);

    }
}

