package com.eazybytes.eazyschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.eazyschool.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	Person readByEmail(String email);
}
