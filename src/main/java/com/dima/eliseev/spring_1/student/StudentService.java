package com.dima.eliseev.spring_1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> Hello(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        Optional<Student> studentOptional =
        studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }
}
