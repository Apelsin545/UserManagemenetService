package ru.eventplanner.usermanagementservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User updateNameById(Long userId) {
        return userRepository.updateById(userId);
    }

    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }
}
