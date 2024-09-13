package com.group1.ecocredit.repositories;

import com.group1.ecocredit.enums.Role;
import com.group1.ecocredit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findById(Integer id);

    User findByRole(Role role);

}
