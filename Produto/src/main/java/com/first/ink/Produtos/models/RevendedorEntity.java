package com.first.ink.Produtos.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tbl_revendedor")
public class RevendedorEntity {
	
	private String nomeRevendedor;
	private String cpf;
	private String celular;
	private String email;
	private boolean whats;
	
	@Id
	public String getNomeRevendedor() {
		return nomeRevendedor;
	}
	public void setNomeRevendedor(String nomeRevendedor) {
		this.nomeRevendedor = nomeRevendedor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean getWhats() {
		return whats;
	}
	public void setWhats(boolean whats) {
		this.whats = whats;
	}
	
	

}
