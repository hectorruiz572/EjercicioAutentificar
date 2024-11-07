package com.hectorruiz.EjercicioAutentificar.persistence.repositories;

import com.hectorruiz.EjercicioAutentificar.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);

    List<User> findAll();
}
