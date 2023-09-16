package com.roman.portier.dao;

import com.roman.portier.entity.WorkCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCardRepository extends JpaRepository<WorkCard, Integer> {
}