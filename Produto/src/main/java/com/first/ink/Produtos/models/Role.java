package com.first.ink.Produtos.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="Role")
public class Role implements GrantedAuthority {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String nomeRole;
	
	@ManyToMany(mappedBy="roles")
	private List<LoginEntity> usuarios;

	public String getNomeRole() {
		return nomeRole;
	}



	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}



	@Override
	public String getAuthority() {
		
		return this .nomeRole;
	}

}
