package com.example.spring_demo1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student prajjwal = new Student(
                    "Prajjwal",
                    "prajjwalpachauri@gmail.com",
                    LocalDate.of(2002, Month.MAY, 2)
            );
            Student ajay = new Student(
                    "Ajay",
                    "ajaypachauri@gmail.com",
                    LocalDate.of(2000, Month.MAY, 2)
            );

            repository.saveAll(List.of(prajjwal, ajay));
        };
    };
}
