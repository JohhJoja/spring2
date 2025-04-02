package com.dima.eliseev.spring_1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Dimas = new Student(
                    "Dimas",
                    "123@gmail.com",
                    21);
            Student Ananas = new Student(
                    "Ananas",
                    "Ananas@gmail.com",
                    19);

            repository.saveAll(
                    List.of(Dimas,Ananas)
            );
        };
    }
}
