package com.hamzaouni;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    @Configuration
    @Import(DefaultConfig.class)
    public static class MyAppConfig {

    }


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DefaultConfig.class);

        DataSource ds = ctx.getBean(DataSource.class);

        try(Connection connection = ds.getConnection();) {
            System.out.println("============== connection.isValid(5000) = " + connection.isValid(5000));
            System.out.println("hi");
        } catch (SQLException E) {

        }


    }
}

