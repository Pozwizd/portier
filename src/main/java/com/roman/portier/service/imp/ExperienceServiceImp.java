package com.roman.portier.service.imp;


import com.roman.portier.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImp {

    ExperienceRepository experienceRepository;

    public ExperienceServiceImp(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public void getExperience(int id) {
        experienceRepository.findById(id);
    }

}
