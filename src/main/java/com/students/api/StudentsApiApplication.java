package com.students.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StudentsApiApplication {

    /**
     * @param args
     * Main method.
     */
    public static void main(final String[] args) {
        SpringApplication.run(StudentsApiApplication.class, args);
    }

}
