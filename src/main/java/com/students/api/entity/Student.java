package com.students.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    /**
     * This is a studentId of the variable.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    /**
     * This is a firstName of the variable.
     */
    @Column(name = "first_name")
    private String firstName;
    /**
     * This is a lastName of the variable.
     */
    @Column(name = "last_name")
    private String lastName;
    /**
     * This is an age of the variable.
     */
    @Column(name = "age")
    private Integer age;
}
