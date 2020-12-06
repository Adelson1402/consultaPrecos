package com.first.ink.Produto.Security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.first.ink.Produtos.models.LoginEntity;
import com.first.ink.repository.LoginRepository;

@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService {
	
	@Autowired
	private LoginRepository lr;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		LoginEntity loginEntity = lr.findByLogin(login);
		
		if(loginEntity == null) {
			throw new UsernameNotFoundException ("Usuário não cadastrado!");
		}
		return new User(loginEntity.getUsername(),loginEntity.getPassword(), true, true, true, true, loginEntity.getAuthorities());
	}
	
	

}
