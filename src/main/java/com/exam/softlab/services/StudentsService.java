package com.exam.softlab.services;

import com.exam.softlab.entities.Students;

import java.util.List;

public interface StudentsService {

    void addStudent(Students data);

    List<Students> search(Integer studentId, String firstname, String lastname,Integer personalNumber);

    void updateData(Integer studentId,String firstName,String lastName,Integer personalNumber,String email,Integer mobileNumber);

}
