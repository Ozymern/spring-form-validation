package com.ozymern.spring.form.validation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozymern.spring.form.validation.domain.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
