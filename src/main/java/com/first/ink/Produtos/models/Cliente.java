package com.first.ink.Produtos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tbl_cliente")
public class Cliente {

	//Dados básicos de clientes
	
	private long codigoCliente;
	
	private String nomeCliente;
	
	private String dataDeNascimentoCliente;
	
	private String telefoneCliente;
	
	private String cpfCliente;
	
	private String cnpjCliente;
	
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDataDeNascimentoCliente() {
		return dataDeNascimentoCliente;
	}
	public void setDataDeNascimentoCliente(String dataDeNascimentoCliente) {
		this.dataDeNascimentoCliente = dataDeNascimentoCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getCnpjCliente() {
		return cnpjCliente;
	}
	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}
	
	
}
