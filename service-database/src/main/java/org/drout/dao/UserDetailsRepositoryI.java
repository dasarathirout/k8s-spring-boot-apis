package org.drout.dao;

import org.drout.dao.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepositoryI extends JpaRepository<UserDetails, Long> {
}
