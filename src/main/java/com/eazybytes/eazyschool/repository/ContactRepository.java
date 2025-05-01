package com.eazybytes.eazyschool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.eazyschool.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>{

	
	List<Contact> findByStatus(String status);
}
