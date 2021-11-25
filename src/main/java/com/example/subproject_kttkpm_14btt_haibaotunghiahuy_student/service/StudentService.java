package com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.service;


import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.entity.Student;
import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(long id){
        return studentRepository.findById(id).get();
    }

    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }
}
