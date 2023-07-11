package com.students.api.serviceImpl;

import com.students.api.client.JsonPlaceholderClient;
import com.students.api.client.Post;
import com.students.api.entity.Student;
import com.students.api.repository.StudentRepository;
import com.students.api.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    /**
     * repo.
     */
    private final StudentRepository repository;
    /**
     * client.
     */
    private final JsonPlaceholderClient client;

    /**     *
     * @param repositoryParam repository
     * @param clientParam client service
     * Constructor's class.
     */
    public StudentServiceImpl(
            final StudentRepository repositoryParam,
            final JsonPlaceholderClient clientParam) {
        this.repository = repositoryParam;
        this.client = clientParam;
    }

    /**
     * @return a list of students
     * get all the students from the db.
     */
    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    /**
     * @return a student requested by id
     * @param studentId
     * get a specific student by id from the db.
     */
    @Override
    public Optional<Student> getStudent(final Integer studentId) {
        return repository.findById(studentId);
    }

    /**
     * @return the new student load to the db
     * @param student
     * save a new student onto the db.
     */
    @Override
    public Student saveStudent(final Student student) {
        return repository.save(student);
    }

    /**
     * @param studentId
     * delete a student by id.
     */
    @Override
    public void deleteStudent(final Integer studentId) {
        repository.deleteById(studentId);
    }

    /**
     * @return the student updated
     * @param student
     * can update a student that exists in the db.
     */
    @Override
    public Student updateStudent(final Student student) {
        Optional<Student> studentFound =
                repository.findById(student.getStudentId());

        if (studentFound.isPresent()) {
            repository.save(student);
        }

        return student;
    }

    /**
     * @return list of posts
     * get all the posts from a public api.
     */
    @Override
    public List<Post> getAllPosts() {
        return client.getAllPosts();
    }

}
