package com.exam.softlab.services;

import com.exam.softlab.entities.Groups;
import com.exam.softlab.repositories.GroupsRepository;
import com.exam.softlab.repositories.StudentsRepository;
import com.exam.softlab.repositories.TeachersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupsServiceImpl implements GroupsService {
    private final GroupsRepository groupsRepository;
    private final TeachersRepository teachersRepository;
    private  final StudentsRepository studentsRepository;


    @Override
    public void createGroup( Groups data) {
        Groups groups = new Groups();
        data.setGroupId(data.getGroupId());
        data.setGroupNumber(data.getGroupNumber());
        data.setTeacherId(data.getTeacherId());
        data.setStudentId(data.getStudentId());
        groupsRepository.save(data);
    }

    @Override
    public List<Groups> search(Integer groupId, Integer groupNumber, Integer studentId, Integer teacherId) {
        return groupsRepository.findAll();
    }


}
