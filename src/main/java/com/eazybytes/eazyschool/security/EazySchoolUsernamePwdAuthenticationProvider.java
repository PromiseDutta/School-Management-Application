package com.eazybytes.eazyschool.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.eazybytes.eazyschool.model.Person;
import com.eazybytes.eazyschool.model.Roles;
import com.eazybytes.eazyschool.repository.PersonRepository;

@Component
public class EazySchoolUsernamePwdAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String email = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		Person person = personRepository.readByEmail(email);

		if (person != null && person.getPersonId() > 0 && pwd.equals(person.getPwd())) {
			return new UsernamePasswordAuthenticationToken(person.getName(), pwd,
					getGrantedAuthorities(person.getRoles()));

		} else
			throw new BadCredentialsException("Invalid Credentials");
	}

	private List<GrantedAuthority> getGrantedAuthorities(Roles roles) {
		List<GrantedAuthority> grantedauthorities = new ArrayList<>();
		grantedauthorities.add(new SimpleGrantedAuthority("ROLE_" + roles.getRoleName()));
		return grantedauthorities;
	}

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
