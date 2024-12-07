package com.klu.jfsd.exam;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    public static DefaultListableBeanFactory java;

	// Bean for Employee
    @Bean
    public Employee employee() {
        return new Employee(
                101, 
                "Charisma", 
                75000.0, 
                "IT", 
                Arrays.asList("Java", "Spring", "Hibernate")
        );
    }

    // Bean for Instructor
    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(1);
        instructor.setName("Dr. Smith");
        instructor.setEmail("smith@example.com");
        instructor.setPhoneNumber("9876543210");
        return instructor;
    }

    // Bean for Course (Autowiring Instructor)
    @Bean
    public Course course(Instructor instructor) {
        Course course = new Course();
        course.setCourseId(501);
        course.setCourseName("Advanced Java");
        course.setCredits(4);
        course.setInstructor(instructor); // Autowiring through setter injection
        return course;
    }
}
