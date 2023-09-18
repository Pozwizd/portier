package com.roman.portier.service.imp;

import com.roman.portier.repository.WorkCardRepository;
import com.roman.portier.entity.WorkCard;
import com.roman.portier.service.WorkCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkCardServiceImp implements WorkCardService {

    @Autowired
    private WorkCardRepository workCardRepository;

    @Override
    public WorkCard getWorkCard(int id) {
        return workCardRepository.findById(id).get();
    }
}
