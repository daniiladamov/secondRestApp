package com.example.restApi.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
@Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){

return  args -> {
  studentRepository.saveAll(List.of(
          new Student("Alex", LocalDate.of(1994, Month.OCTOBER,31),"alex@gmail.com"),
          new Student("John", LocalDate.of(1994, Month.AUGUST,12),"john@gmail.com"),
          new Student("Bin", LocalDate.of(1994, Month.JULY,4),"bin@gmail.com")

          ));
};
    }
}
