package com.example.restApi.students;

import com.example.restApi.response.RestApiExeption;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list(){
        return studentRepository.findAll();
    }

    public void add(Student student){
       if( studentRepository.findStudentByEmail(student.getEmail()).isPresent())
           throw new RestApiExeption("Email is busy");

 studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public void update(Student student) {
        Optional<Student> item=studentRepository.findById(student.getId());
        if (item.isPresent()){
            Student st=item.get();
            if (!student.getName().isEmpty()) st.setName(student.getName());
            if (student.getDob()!=null) st.setDob(student.getDob());
            studentRepository.save(st);
        }

    }
}
