package com.exam.softlab.controllers;


import com.exam.softlab.entities.Students;
import com.exam.softlab.services.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @PostMapping("addStudents")
    public void addStudent(@RequestBody Students data) {
        studentsService.addStudent(data);
    }

    @GetMapping("students")
    public List<Students> search(Integer studentId, String firstName, String lastName, Integer personalNumber) {
        return studentsService.search(studentId, firstName, lastName, personalNumber);

    }

    @PostMapping("update")
    public void updateStudents(@RequestBody Students students) {
        studentsService.updateData(students.getStudentId(), students.getFirstName(),
                students.getLastName(), students.getPersonalNumber(),
                students.getEmail(), students.getMobileNumber());
    }


}
