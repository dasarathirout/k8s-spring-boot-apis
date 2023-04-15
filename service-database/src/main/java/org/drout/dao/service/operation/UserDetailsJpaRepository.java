package org.drout.dao.service.operation;

import org.drout.dao.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsJpaRepository extends JpaRepository<UserDetails, Long> {

}
