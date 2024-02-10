package com.exam.softlab.controllers;


import com.exam.softlab.entities.Teachers;
import com.exam.softlab.services.TeachersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeachersController {

    private final TeachersService teachersService;

    @PostMapping("addTeacher")
    public void addTeacher(@RequestBody Teachers data) {
        teachersService.addTeacher(data);
    }

    @GetMapping("teachers")
    public List<Teachers> search(Integer teacherId, String firstName, String lastName, Integer personalNumber) {
        return teachersService.search(teacherId, firstName, lastName, personalNumber);
    }

    @PostMapping("updateData")
    public void updateTeachers(@RequestBody Teachers teachers) {
        teachersService.updateTeacherData(teachers.getTeacherId(), teachers.getFirstName(),
                teachers.getLastName(), teachers.getPersonalNumber(), teachers.getEmail(),
                teachers.getMobileNumber());
    }

    @DeleteMapping("/teachers/{teacherId}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer teacherId) {
        teachersService.delete(teacherId);
        return ResponseEntity.noContent().build();
    }

}
