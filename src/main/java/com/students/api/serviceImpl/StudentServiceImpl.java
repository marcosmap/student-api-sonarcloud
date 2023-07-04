package com.students.api.serviceImpl;

import com.students.api.client.JsonPlaceholderClient;
import com.students.api.client.Post;
import com.students.api.entity.Student;
import com.students.api.repository.StudentRepository;
import com.students.api.service.StudentService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    private final JsonPlaceholderClient client;

    public StudentServiceImpl(StudentRepository repository, JsonPlaceholderClient client) {
        this.repository = repository;
        this.client = client;
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> getStudent(Integer studentId) {
        return repository.findById(studentId);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> studentFound = repository.findById(student.getStudentId());

        if (studentFound.isPresent()) {
            repository.save(student);
        }

        return student;
    }

    @Override
    public List<Post> getAllPosts() {
        return client.getAllPosts();
    }

}
