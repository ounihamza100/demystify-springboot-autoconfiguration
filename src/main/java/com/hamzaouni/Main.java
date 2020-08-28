package com.hamzaouni;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args) throws LifecycleException {

        final Tomcat tomcat = new Tomcat();
        tomcat.setPort(8089);

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/","helloServlet");

        tomcat.start();

        new Thread(() -> tomcat.getServer().await()).start();
    }
}

