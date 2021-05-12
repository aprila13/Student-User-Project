package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import org.springframework.web.bind.annotation.RequestMapping;

@RestController  //Makes this class serve rest endpoints
@RequestMapping(path = "api/v1/student")

//This class will hold all resources for the API
public class StudentController {

    //StudentService is the data type I created.
    //studentService is the variable name
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Creates a new Student instance and serves to localhost 8080
    //It gets converted into a JSON object
	@GetMapping
	public List<Student> getStudents() {
        return studentService.getStudents();
	}
}
