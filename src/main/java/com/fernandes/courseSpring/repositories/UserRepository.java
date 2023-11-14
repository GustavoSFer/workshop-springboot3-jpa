package com.fernandes.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandes.courseSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
