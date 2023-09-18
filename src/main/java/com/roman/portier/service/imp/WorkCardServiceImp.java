package com.roman.portier.service.imp;

import com.roman.portier.entity.WorkCard;
import com.roman.portier.repository.WorkCardRepository;
import com.roman.portier.service.WorkCardService;
import org.springframework.stereotype.Service;

@Service
public class WorkCardServiceImp implements WorkCardService {

    private final WorkCardRepository workCardRepository;

    public WorkCardServiceImp(WorkCardRepository workCardRepository) {
        this.workCardRepository = workCardRepository;
    }

    @Override
    public WorkCard getWorkCard(int id) {
        return workCardRepository.findById(id).get();
    }
}
