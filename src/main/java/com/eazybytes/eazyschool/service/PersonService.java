package com.eazybytes.eazyschool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eazybytes.eazyschool.constants.EazySchoolConstants;
import com.eazybytes.eazyschool.model.Person;
import com.eazybytes.eazyschool.model.Roles;
import com.eazybytes.eazyschool.repository.PersonRepository;
import com.eazybytes.eazyschool.repository.RolesRepository;



 
@Service
public  class PersonService {

@Autowired
RolesRepository rolesRepository;

@Autowired
 PersonRepository personRepository;
	
@Autowired
PasswordEncoder passwordEncdoer;
	public Boolean createNewPerson(Person person) {
		 
		boolean isSaved=false;
		Roles role=rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
		person.setRoles(role);
	
		person.setPwd(passwordEncdoer.encode(person.getPwd()));
		
		person=personRepository.save(person);
		
		if(person!=null && person.getPersonId()>0)
		{
			isSaved=true;
		}
		 return isSaved;
		 
	 }
	
	
}
