package com.example.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitaryStatusRepository extends JpaRepository<MilitaryStatus, Long> {
}
