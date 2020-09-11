package com.first.ink.Produtos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table (name="tbl_revendedor")
public class RevendedorEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigoRevendedor;
	
	private String nomeRevendedor;
	
	private String cpf;
	private String celular;
	private String email;
	private boolean whats;
	
	
	@Column(name="nome_revendedor")
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
	public long getCodigoRevendedor() {
		return codigoRevendedor;
	}
	public void setCodigoRevendedor(long codigoRevendedor) {
		this.codigoRevendedor = codigoRevendedor;
	}
	
	

}
