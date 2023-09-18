package com.roman.portier.repository;

import com.roman.portier.entity.WorkCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCardRepository extends JpaRepository<WorkCard, Integer> {
}