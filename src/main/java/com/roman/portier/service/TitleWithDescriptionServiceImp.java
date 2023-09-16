package com.roman.portier.service;

import com.roman.portier.dao.TitleWithDescriptionRepository;
import com.roman.portier.entity.TitleWithDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleWithDescriptionServiceImp implements TitleWithDescriptionService {

    @Autowired
    private TitleWithDescriptionRepository titleWithDescriptionRepository;

    @Override
    public TitleWithDescription getTitleWithDescription(int id) {
        return titleWithDescriptionRepository.findById(id).get();
    }
}
