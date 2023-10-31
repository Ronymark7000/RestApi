package com.module.helloWorld.controller;

import com.module.helloWorld.model.Student;
import com.module.helloWorld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class helloWorld {

    @Autowired
     private StudentService studentService;


    //For Printing Hello World
    @GetMapping("print/hello-world")
    public String printHelloWorld() {
        System.out.println("Hello world.");
        return "Hello world";
    }

    //For showing Existing Student record of DBA
    @GetMapping("get/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //For Inserting Data in DBA
    @PostMapping("insert/student")
    public String addStudent(@RequestBody Student student) {
        // Add the student to the list
        studentService.addStudent(student);
        return "Student ID:" + student.getId() + "Student added: " + student.getName();
    }


    //For Updating data in DBA
    @PutMapping("update/student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        studentService.updateStudent(updatedStudent);
    }


    /*
    public String updateStudent(@PathVariable Integer id,@RequestBody Student updatedStudent ){
        Student student = studentService.findById(id).orElse(null);

        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            studentService.updateStudent(student);
            return "Student with ID " + id + " updated.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
     */

    //For deleting the records in DBA
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        boolean isDeleted = studentService.deleteStudent(id);
        if (isDeleted) {
            return "Student with ID " + id + " deleted.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
}





