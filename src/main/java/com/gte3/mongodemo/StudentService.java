package com.gte3.mongodemo;


import java.util.List;

public interface StudentService {
//sss1
    List<Student> getAll();
    Student getByEmail(String email);
    String deleteByEmail(String email);
    String createStudent(Student studentModel);
    String updateStudent(String email, Student student);

}