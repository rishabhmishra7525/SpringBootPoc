package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.enity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
