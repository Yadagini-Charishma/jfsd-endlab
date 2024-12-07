package com.klu.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.java);

        // Demonstrating Constructor Injection
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        // Demonstrating Setter Autowiring
        Course course = context.getBean(Course.class);
        System.out.println(course);
    }
}
