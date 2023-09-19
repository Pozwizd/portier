package com.roman.portier.service;

import com.roman.portier.entity.Feedback;
import com.roman.portier.repository.FeedbackRepository;
import com.roman.portier.service.FeedbackService;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImp implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackServiceImp(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public Feedback getFeedback(int id) {
        return feedbackRepository.findById(id).get();
    }
}
