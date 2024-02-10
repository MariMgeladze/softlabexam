package com.exam.softlab.repositories;

import com.exam.softlab.entities.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Groups,Integer> {
}
