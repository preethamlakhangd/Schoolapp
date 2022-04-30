package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student preetham = new Student(
                    "Preetham",
                    "preethamgeedi@gmail.com",
                    LocalDate.of(1987, Month.APRIL,27)

            );
            Student Fifi = new Student(
                    "Fiorella",
                    "Fiorellageedi@gmail.com",
                    LocalDate.of(1989, Month.DECEMBER,13)

            );
            repository.saveAll(
                    List.of(preetham,Fifi)
            );
        };
    }

}
