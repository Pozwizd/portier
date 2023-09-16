package com.roman.portier.service;

import com.roman.portier.dao.WorkCardRepository;
import com.roman.portier.entity.WorkCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkCardServiceImp implements WorkCardService {

    @Autowired
    private WorkCardRepository workCardRepository;

    @Override
    public WorkCard getWorkCard(int id) {
        return workCardRepository.findById(id).get();
    }
}
