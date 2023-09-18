package com.roman.portier.service.imp;

import com.roman.portier.entity.Skill;
import com.roman.portier.repository.SkillRepository;
import com.roman.portier.service.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImp implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImp(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill getSkill(int id) {
        return skillRepository.findById(id).get();
    }
}
