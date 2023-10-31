package com.module.helloWorld.controller;

public class Example {
}

/*
package com.module.helloWorld.controller;

import com.module.helloWorld.model.Student;
import com.module.helloWorld.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class helloWorld {

    @Autowired
    StudentRepo studentRepo;

    //For Printing Hello World
    @GetMapping("print/hello-world")
    public String printHelloWorld() {
        System.out.println("Hello world.");
        return "Hello world";
    }

    //For Inserting Data in DBA
    @PostMapping("insert/student")
    public String addStudent(@RequestBody Student student) {
        // Add the student to the list
        studentRepo.save(student);
        return "Student added: " + student.getName();

    }

    //For showing Existing Student record of DBA
    @GetMapping("get/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }


    //For Updating data in DBA
    @PutMapping("update/student/{id}")
    public String updateStudent(@PathVariable Integer id,@RequestBody Student updatedStudent ){
        Student student = studentRepo.findById(id).orElse(null);

        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            studentRepo.save(student);
            return "Student with ID " + id + " updated.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }

    //For deleting the records in DBA
    @DeleteMapping("delete/student/{id}")
    public String deleteStudent(@PathVariable Integer id){

        Student student = studentRepo.findById(id).orElse(null);

        if (student != null) {
            studentRepo.delete(student);
            return "Student with ID " + id + " deleted.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
}
*/

