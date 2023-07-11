package com.students.api.service;

import com.students.api.client.Post;
import com.students.api.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    /**
     * @return a list of students
     * recover all the students from the db.
     */
    List<Student> getAllStudents();
    /**
     * @return a student if exists
     * @param studentId
     * get a student by id.
     */
    Optional<Student> getStudent(Integer studentId);
    /**
     * @return the student saved
     * @param student
     * save a student.
     */
    Student saveStudent(Student student);
    /**
     * @param studentId
     * delete a student by id.
     */
    void deleteStudent(Integer studentId);
    /**
     * @return the student updated
     * @param student
     * update a student's data.
     */
    Student updateStudent(Student student);
    /**
     * @return a list of posts
     * get all the posts from a public api.
     */
    List<Post> getAllPosts();
}
