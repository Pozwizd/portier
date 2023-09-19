package com.roman.portier.service;

import com.roman.portier.entity.TitleWithDescription;
import com.roman.portier.repository.TitleWithDescriptionRepository;
import com.roman.portier.service.TitleWithDescriptionService;
import org.springframework.stereotype.Service;

@Service
public class TitleWithDescriptionServiceImp implements TitleWithDescriptionService {

    private final TitleWithDescriptionRepository titleWithDescriptionRepository;

    public TitleWithDescriptionServiceImp(TitleWithDescriptionRepository titleWithDescriptionRepository) {
        this.titleWithDescriptionRepository = titleWithDescriptionRepository;
    }

    @Override
    public TitleWithDescription getTitleWithDescription(int id) {
        return titleWithDescriptionRepository.findById(id).get();
    }
}
