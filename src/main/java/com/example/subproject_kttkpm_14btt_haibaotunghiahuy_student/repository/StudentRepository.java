package com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.repository;

import com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
