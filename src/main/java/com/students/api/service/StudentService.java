package com.students.api.service;

import com.students.api.client.Post;
import com.students.api.entity.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudent(Integer studentId);
    Student saveStudent(Student student);
    void deleteStudent(Integer studentId);
    Student updateStudent(Student student);
    List<Post> getAllPosts();
}
