package com.hamzaouni;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Hamza Ouni
 */
public class TomcatOnClassPathCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            Class.forName("org.apache.catalina.startup.Tomcat");
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

    }
}
