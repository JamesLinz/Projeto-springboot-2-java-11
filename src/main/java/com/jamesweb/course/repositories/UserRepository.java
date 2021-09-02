package com.jamesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
