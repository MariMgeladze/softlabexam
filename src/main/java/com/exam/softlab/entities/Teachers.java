package com.exam.softlab.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(schema = "public",name = "teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teachers_seq_generator")
    @SequenceGenerator(name = "teachers_seq_generator", sequenceName = "teachers_teacher_id_seq", allocationSize = 1)
    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "personal_number")
    private Integer personalNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private Integer mobileNumber;
}
