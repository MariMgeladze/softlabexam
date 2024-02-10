package com.exam.softlab.services;


import com.exam.softlab.entities.Teachers;
import com.exam.softlab.repositories.TeachersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeachersServiceImpl implements TeachersService {

    private final TeachersRepository teachersRepository;

    @Override
    public void addTeacher(Teachers data) {

        Teachers teachers = new Teachers();
        teachers.setFirstName(data.getFirstName());
        teachers.setLastName(data.getLastName());
        teachers.setPersonalNumber(data.getPersonalNumber());
        teachers.setEmail(data.getEmail());
        teachers.setMobileNumber(data.getMobileNumber());
        teachersRepository.save(data);

    }

    @Override
    public List<Teachers> search(Integer teacherId, String firstName, String LastName, Integer personalNumber) {
        return teachersRepository.findAll();
    }

    @Override
    public void updateTeacherData(Integer teacherId, String firstName,
                                  String lastName, Integer personalNumber, String email,
                                  Integer mobileNumber) {
        Optional<Teachers> teachers = teachersRepository.findById(teacherId);
        teachers.get().setTeacherId(teacherId);
        teachers.get().setFirstName(firstName);
        teachers.get().setLastName(lastName);
        teachers.get().setPersonalNumber(personalNumber);
        teachers.get().setEmail(email);
        teachers.get().setMobileNumber(mobileNumber);
        teachersRepository.save(teachers.get());
    }

    @Override
    public void delete(Integer teacherId) {
        Optional<Teachers> teachers = teachersRepository.findById(teacherId);
        if (teachers.isPresent()) {
            teachersRepository.delete(teachers.get());
        } else {
            throw new RuntimeException("Teacher ID doesn't exist - " + teacherId);
        }
    }
}
