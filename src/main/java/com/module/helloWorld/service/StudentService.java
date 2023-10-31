package com.module.helloWorld.service;

import com.module.helloWorld.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public Student findById(Integer id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void updateStudent(Student updatedStudent) {
        Integer id = updatedStudent.getId();
        students.stream()
                .filter(student -> student.getId().equals(id))
                .forEach(student -> {
                    student.setName(updatedStudent.getName());
                    student.setAge(updatedStudent.getAge());
                });
    }

    public boolean deleteStudent(Integer id) {
        return students.removeIf(student -> student.getId().equals(id));
    }
}

