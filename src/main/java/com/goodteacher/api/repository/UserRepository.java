package com.goodteacher.api.repository;

import com.goodteacher.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository to manage {@link User} instances.
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
