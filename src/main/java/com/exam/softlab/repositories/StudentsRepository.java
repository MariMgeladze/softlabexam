package com.exam.softlab.repositories;

import com.exam.softlab.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
