package com.fernandes.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
