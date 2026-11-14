package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
public boolean addStudentDetails(Student std);
public  List<Student> getAllStdDetails();
public Student getStdDetails(long id);
public boolean updateStdDetails(long id,float marks);
}
