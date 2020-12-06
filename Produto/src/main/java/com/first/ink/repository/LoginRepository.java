package com.first.ink.repository;

import org.springframework.data.repository.CrudRepository;

import com.first.ink.Produtos.models.LoginEntity;

public interface LoginRepository extends CrudRepository<LoginEntity, String>{
	
	LoginEntity findByLogin(String login);

	
	
}
