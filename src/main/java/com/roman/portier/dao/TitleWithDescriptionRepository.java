package com.roman.portier.dao;

import com.roman.portier.entity.TitleWithDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleWithDescriptionRepository extends JpaRepository<TitleWithDescription, Integer> {
}