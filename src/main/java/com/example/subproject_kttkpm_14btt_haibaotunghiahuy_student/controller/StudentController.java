package com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.controller;

import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.entity.Student;
import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    Student findStudentById(@PathVariable("id") Long id){
        return studentService.findStudentById(id);
    }
    @GetMapping("/")
    List<Student> findAllStudents(){
        return studentService.findAllStudent();
    }
}
