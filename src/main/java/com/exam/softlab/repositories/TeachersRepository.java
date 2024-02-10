package com.exam.softlab.repositories;

import com.exam.softlab.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachersRepository extends JpaRepository<Teachers,Integer> {
}
