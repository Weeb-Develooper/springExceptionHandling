package com.spring.springbootexception.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class MySimpleMappingExceptionResolver {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mapping = new Properties();
        mapping.put("java.lang.ArithmeticException","mathError");
        mapping.put("java.lang.NullPointerException","add");
        resolver.setExceptionMappings(mapping);
        return resolver;
    }
}
