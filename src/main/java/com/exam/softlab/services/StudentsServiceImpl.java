package com.exam.softlab.services;

import com.exam.softlab.entities.Students;
import com.exam.softlab.repositories.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    @Override
    public void addStudent(Students data) {

        Students students = new Students();
        students.setFirstName(data.getFirstName());
        students.setLastName(data.getLastName());
        students.setPersonalNumber(data.getPersonalNumber());
        students.setEmail(data.getEmail());
        students.setMobileNumber(data.getMobileNumber());
        studentsRepository.save(data);


    }

    @Override
    public List<Students> search(Integer studentId, String firstname, String lastname, Integer personalNumber) {
        return studentsRepository.findAll();
    }

    @Override
    public void updateData(Integer studentId, String firstName,
                           String lastName, Integer personalNumber,
                           String email, Integer mobileNumber) {

        Optional<Students> students = studentsRepository.findById(studentId);
        students.get().setStudentId(studentId);
        students.get().setFirstName(firstName);
        students.get().setLastName(lastName);
        students.get().setPersonalNumber(personalNumber);
        students.get().setEmail(email);
        students.get().setMobileNumber(mobileNumber);
        studentsRepository.save(students.get());

    }
}


