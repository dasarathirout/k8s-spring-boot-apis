package org.drout.dao.service;

import org.drout.dao.entities.TaskCardDetails;


import java.util.List;

public interface TaskCardDetailsService {
    TaskCardDetails createUserDetails(TaskCardDetails taskCardDetails);
    TaskCardDetails getUserDetailsById(Long cardId);
    List<TaskCardDetails> getAllUserDetails();
    TaskCardDetails updateUserDetails(TaskCardDetails taskCardDetails);
    void deleteTaskCardDetails(Long cardId);
}
