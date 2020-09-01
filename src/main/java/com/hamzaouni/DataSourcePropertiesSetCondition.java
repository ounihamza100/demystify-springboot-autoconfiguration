package com.hamzaouni;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Hamza Ouni
 */
public class DataSourcePropertiesSetCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //we can also check values
       return  conditionContext.getEnvironment().containsProperty("spring.datasource.url")
          &&  conditionContext.getEnvironment().containsProperty("spring.datasource.driver-class-name") ;

    }
}
