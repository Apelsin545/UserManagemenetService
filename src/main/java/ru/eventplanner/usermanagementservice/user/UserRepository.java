package ru.eventplanner.usermanagementservice.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User updateById(Long userId);
}
