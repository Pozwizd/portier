package com.roman.portier.service;

import com.roman.portier.dao.FeedbackRepository;
import com.roman.portier.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImp implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback getFeedback(int id) {
        return feedbackRepository.findById(id).get();
    }
}
