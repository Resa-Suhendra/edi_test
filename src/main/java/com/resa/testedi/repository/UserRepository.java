package com.resa.testedi.repository;

import com.resa.testedi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Resa S.
 * Date: 19-04-2023
 * Created in IntelliJ IDEA.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
