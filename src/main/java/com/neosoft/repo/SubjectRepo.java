package com.neosoft.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.enity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {

	
	@Query(value = "SELECT subject_name FROM public.subject ", nativeQuery = true)
	List<String> findAllexperienceLavel();

	@Query(value = "SELECT skill FROM public.subject ", nativeQuery = true)
	List<String> findAllSkillLavel();

}
