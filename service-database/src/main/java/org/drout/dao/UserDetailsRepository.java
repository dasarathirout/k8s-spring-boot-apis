package org.drout.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.drout.dao.entities.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDetailsRepository  {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(UserDetails userDetails){
        entityManager.persist(userDetails);
        return userDetails.getId();
    }

}
