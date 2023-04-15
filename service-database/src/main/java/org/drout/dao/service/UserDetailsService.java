package org.drout.dao.service;

import org.drout.dao.entities.UserDetails;

import java.util.List;

public interface UserDetailsService {
    UserDetails createUserDetails(UserDetails userDetails);
    UserDetails getUserDetailsById(Long userId);
    List<UserDetails> getAllUserDetails();
    UserDetails updateUserDetails(UserDetails userDetails);
    void deleteUserDetails(Long userId);
}
