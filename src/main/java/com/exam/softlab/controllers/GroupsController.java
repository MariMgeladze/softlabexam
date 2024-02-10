package com.exam.softlab.controllers;

import com.exam.softlab.entities.Groups;
import com.exam.softlab.services.GroupsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupsController {
    private final GroupsService groupsService;

 @PostMapping("addGroup")

 public void addGroup (@RequestBody Groups data) {
    groupsService.createGroup(data);
 }

 @GetMapping("groups")
    public List<Groups>search(Integer groupId, Integer groupNumber, Integer studentId, Integer teacherId){
     return groupsService.search(groupId,groupNumber,studentId,teacherId);
 }


}
