package com.students.api.resource;

import com.students.api.client.Post;
import com.students.api.entity.Student;
import com.students.api.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student/api/v1")
public class StudentResource {

    private final StudentService service;

    public StudentResource(StudentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{studentId}")
    ResponseEntity<Optional<Student>> getStudentById(@PathVariable("studentId") Integer studentId) {
        return new ResponseEntity<>(service.getStudent(studentId), HttpStatus.OK);
    }

    @PostMapping("/save")
    ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(service.saveStudent(student), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{studentId}")
    ResponseEntity<Student> deleteStudent(@PathVariable("studentId") Integer studentId) {
        service.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        return new ResponseEntity<>(service.updateStudent(student), HttpStatus.OK);
    }

    @GetMapping("/posts")
    ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<>(service.getAllPosts(), HttpStatus.OK);
    }

}
