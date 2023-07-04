package com.students.api.repository;

import com.students.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
