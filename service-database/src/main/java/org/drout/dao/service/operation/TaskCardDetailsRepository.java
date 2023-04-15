package org.drout.dao.service.operation;

import org.drout.dao.entities.TaskCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCardDetailsRepository  extends JpaRepository<TaskCardDetails, Long> {
}
