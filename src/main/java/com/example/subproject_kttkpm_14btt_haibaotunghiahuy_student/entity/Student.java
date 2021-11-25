package com.example.subproject_kttkpm_14btt_haibaotunghiahuy_student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_service")
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;

    private String name;

    private String address;

    private String className;
}
