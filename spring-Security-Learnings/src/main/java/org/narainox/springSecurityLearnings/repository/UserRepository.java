package org.narainox.springSecurityLearnings.repository;

import org.narainox.springSecurityLearnings.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
