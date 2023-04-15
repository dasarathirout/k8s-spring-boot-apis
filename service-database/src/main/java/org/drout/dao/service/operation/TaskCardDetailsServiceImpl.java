package org.drout.dao.service.operation;


import lombok.AllArgsConstructor;
import org.drout.dao.entities.TaskCardDetails;
import org.drout.dao.service.TaskCardDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskCardDetailsServiceImpl implements TaskCardDetailsService {
    TaskCardDetailsRepository cardDetailsRepository;

    @Override
    public TaskCardDetails createUserDetails(TaskCardDetails taskCardDetails) {
        return cardDetailsRepository.save(taskCardDetails);
    }

    @Override
    public TaskCardDetails getUserDetailsById(Long cardId) {
        return cardDetailsRepository.findById(cardId).get();
    }

    @Override
    public List<TaskCardDetails> getAllUserDetails() {
        return cardDetailsRepository.findAll();
    }

    @Override
    public TaskCardDetails updateUserDetails(TaskCardDetails taskCardDetails) {
        return cardDetailsRepository.save(taskCardDetails);
    }

    @Override
    public void deleteTaskCardDetails(Long cardId) {
        cardDetailsRepository.deleteById(cardId);
    }
}
