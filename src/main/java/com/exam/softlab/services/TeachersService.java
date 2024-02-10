package com.exam.softlab.services;

import com.exam.softlab.entities.Teachers;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface TeachersService {

    void addTeacher(Teachers data);

    List<Teachers> search(Integer teacherId, String firstName, String LastName, Integer personalNumber);

    void updateTeacherData(Integer teacherId, String firstName,
                           String lastName, Integer personalNumber,
                           String email, Integer mobileNumber);

    void delete(Integer teacherId);
}
