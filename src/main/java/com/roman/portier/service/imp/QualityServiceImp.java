package com.roman.portier.service.imp;

import com.roman.portier.entity.Quality;
import com.roman.portier.repository.QualityRepository;
import com.roman.portier.service.QualityService;
import org.springframework.stereotype.Service;

@Service
public class QualityServiceImp implements QualityService {

    private QualityRepository qualityRepository;

    @Override
    public Quality getQuality(int id) {
        return qualityRepository.findById(id).get();
    }
}
