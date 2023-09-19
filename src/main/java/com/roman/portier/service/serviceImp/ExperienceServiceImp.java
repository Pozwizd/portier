package com.roman.portier.service.serviceImp;


import com.roman.portier.entity.Experience;
import com.roman.portier.repository.ExperienceRepository;
import com.roman.portier.service.ExperienceService;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImp implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImp(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }


    @Override
    public Experience getExperience(int id) {
        return experienceRepository.findById(id).get();
    }
}
