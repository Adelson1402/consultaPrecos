package com.first.ink.Produtos.models;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="tbl_produtos")
public class Produtos implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private String nome;
	
	private String tipo;
	
	private String valor;
	
	private String marca;
	
	private String valorRevenda;
	
	private String valorFornecedor;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
 
	public String getValorRevenda() {
		return valorRevenda;
	}
	public void setValorRevenda(String valorRevenda) {
		this.valorRevenda = valorRevenda;
		
	}
	public String getValorFornecedor() {
		return valorFornecedor;
	}
	public void setValorFornecedor(String valorFornecedor) {
		this.valorFornecedor = valorFornecedor;
	}
	
	
}