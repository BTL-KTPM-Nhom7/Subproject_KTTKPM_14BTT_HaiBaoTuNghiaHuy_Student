package com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.service;


import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.entity.Student;
import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.repository.StudentRepository;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private int flag = 0;

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Retry(name= "basic")
    @Cacheable(value = "customer")
    public Student findStudentById(long id){
        return studentRepository.findById(id).get();
    }

    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }
}
