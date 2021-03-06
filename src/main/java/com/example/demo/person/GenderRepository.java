package com.example.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {

    Optional<Gender> findGenderByGender(String gender);
}
