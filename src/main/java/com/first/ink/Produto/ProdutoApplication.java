package com.first.ink.Produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EntityScan({"com.first.ink.Produtos.models"})
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.first.ink.Produto.controller","com.first.ink.Produto.Security"})
@EnableJpaRepositories("com.first.ink.repository")
public class ProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("adm"));
		System.out.println(new BCryptPasswordEncoder().encode("chocolate01"));
		System.out.println(new BCryptPasswordEncoder().encode("loja154"));
		
	}

}
