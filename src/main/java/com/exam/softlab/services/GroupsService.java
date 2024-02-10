package com.exam.softlab.services;

import com.exam.softlab.entities.Groups;

import java.util.List;

public interface GroupsService {

    void createGroup(Groups data);

    List<Groups> search(Integer groupId,Integer groupNumber,Integer studentId,Integer teacherId);


}
