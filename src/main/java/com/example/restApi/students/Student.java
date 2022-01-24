package com.example.restApi.students;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName ="student_sequence" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    private String name;
    private LocalDate dob;
    private int age;

    public String getEmail() {
        return email;
    }
    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between( dob, LocalDate.now()).getYears();
    }


    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
               this.email=email;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
