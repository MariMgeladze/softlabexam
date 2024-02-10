package com.exam.softlab.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(schema = "public",name = "groups")
public class Groups {
    @Id
    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "group_Number")
    private Integer groupNumber;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "teacher_id")
    private Integer teacherId;
}
