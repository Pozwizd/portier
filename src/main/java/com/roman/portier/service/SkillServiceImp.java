package com.roman.portier.service;

import com.roman.portier.dao.SkillRepository;
import com.roman.portier.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkillServiceImp implements SkillService {

    @Autowired
    private SkillRepository skillRepository;
    @Override
    public Skill getSkill(int id) {
        return skillRepository.findById(id).get();
    }
}
