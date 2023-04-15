package org.drout.dao.service.operation;

import lombok.AllArgsConstructor;
import org.drout.dao.entities.UserDetails;
import org.drout.dao.service.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDetailsJpaRepository detailsJpaRepository;
    @Override
    public UserDetails createUserDetails(UserDetails userDetails) {
        return detailsJpaRepository.save(userDetails);
    }

    @Override
    public UserDetails getUserDetailsById(Long userId) {
        return detailsJpaRepository.findById(userId).get();
    }

    @Override
    public List<UserDetails> getAllUserDetails() {
        return detailsJpaRepository.findAll();
    }

    @Override
    public UserDetails updateUserDetails(UserDetails newUserDetails) {
        UserDetails existingUserDetails = detailsJpaRepository.findById(newUserDetails.getId()).get();
        existingUserDetails.setId(newUserDetails.getId());
        existingUserDetails.setName(newUserDetails.getName());
        existingUserDetails.setRole(newUserDetails.getRole());
        UserDetails updatedUserDetails = detailsJpaRepository.save(existingUserDetails);
        return updatedUserDetails;
    }

    @Override
    public void deleteUserDetails(Long userId) {
        detailsJpaRepository.deleteById(userId);
    }
}
