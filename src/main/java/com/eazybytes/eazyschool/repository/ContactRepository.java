package com.eazybytes.eazyschool.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eazybytes.eazyschool.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

	List<Contact> findByStatus(String status);

	//@Query("Select c from Contact c where c.status=:status")
	
	//@Query(value="Select c from contact_msg c where c.status=:status",nativeQuery = true)
	
	@Query(value="Select * from contact_msg c where c.status=:status",nativeQuery = true)
	Page<Contact> findByStatus(String status, Pageable pageable);
	
	@Transactional
	@Modifying
	@Query("Update Contact c set c.status=?1 where c.contactId=?2")
	int updateMessageStatusById(String status,int id);
}
