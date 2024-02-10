package com.exam.softlab.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

@Entity
@Setter
@Getter
@Table(schema = "public",name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_seq_generator")
    @SequenceGenerator(name = "students_seq_generator", sequenceName = "students_student_id_seq", allocationSize = 1)
    @Column(name = "student_id")
    private Integer studentId;

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
