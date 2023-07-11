package com.students.api.resource;

import com.students.api.client.Post;
import com.students.api.entity.Student;
import com.students.api.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student/api/v1")
public class StudentResource {

    /**
     * This is a service variable.
     */
    private final StudentService service;

    /**
     * @param serviceParam
     * Constructor's class.
     */
    public StudentResource(final StudentService serviceParam) {
        this.service = serviceParam;
    }

    /**
     * @return a list of students
     * get all the students from the db.
     */
    @GetMapping("/all")
    ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }

    /**
     * @return a student requested by id
     * @param studentId
     * get a specific student by id from the db.
     */
    @GetMapping("/student/{studentId}")
    ResponseEntity<Optional<Student>> getStudentById(
            @PathVariable("studentId") final Integer studentId) {
        return new
                ResponseEntity<>(service.getStudent(studentId), HttpStatus.OK);
    }

    /**
     * @return the new student load to the db
     * @param student
     * save a new student onto the db.
     */
    @PostMapping("/save")
    ResponseEntity<Student> saveStudent(
            @RequestBody final Student student) {
        return new ResponseEntity<Student>(
                service.saveStudent(student), HttpStatus.OK);
    }

    /**
     * @return status ok - 200
     * @param studentId
     * delete a student by id.
     */
    @DeleteMapping("/delete/{studentId}")
    ResponseEntity<Student> deleteStudent(
            @PathVariable("studentId") final Integer studentId) {
        service.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * @return the student updated
     * @param student
     * can update a student that exists in the db.
     */
    @PutMapping("/update")
    ResponseEntity<Student> updateStudent(
            @RequestBody final Student student) {
        return new
                ResponseEntity<>(service.updateStudent(student), HttpStatus.OK);
    }

    /**
     * @return list of posts
     * get all the posts from a public api.
     */
    @GetMapping("/posts")
    ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<>(service.getAllPosts(), HttpStatus.OK);
    }

}
