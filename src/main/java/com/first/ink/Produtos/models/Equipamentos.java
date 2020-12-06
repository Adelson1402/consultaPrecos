package com.first.ink.Produtos.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long equipamentoID;
	
	private String equipamento;
	
	private String equipamentoMarca;
	
	private String equipamentoModelo;
	
	private String equipamentoVoltagem;
	
	private String equipamentoEstado;
	
	private String equipamentoDefeito;
	
	private String equipamentoObservacao;
	
	private Date equipamentoData;
	
	private String ordemDeServicoExterna;
	
	private String equipamentoStatus;
	
	
	public long getEquipamentoID() {
		return equipamentoID;
	}
	public void setEquipamentoID(long equipamentoID) {
		this.equipamentoID = equipamentoID;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public String getEquipamentoMarca() {
		return equipamentoMarca;
	}
	public void setEquipamentoMarca(String equipamentoMarca) {
		this.equipamentoMarca = equipamentoMarca;
	}
	public String getEquipamentoModelo() {
		return equipamentoModelo;
	}
	public void setEquipamentoModelo(String equipamentoModelo) {
		this.equipamentoModelo = equipamentoModelo;
	}
	public String getEquipamentoVoltagem() {
		return equipamentoVoltagem;
	}
	public void setEquipamentoVoltagem(String equipamentoVoltagem) {
		this.equipamentoVoltagem = equipamentoVoltagem;
	}
	public String getEquipamentoEstado() {
		return equipamentoEstado;
	}
	public void setEquipamentoEstado(String equipamentoEstado) {
		this.equipamentoEstado = equipamentoEstado;
	}
	public String getEquipamentoDefeito() {
		return equipamentoDefeito;
	}
	public void setEquipamentoDefeito(String equipamentoDefeito) {
		this.equipamentoDefeito = equipamentoDefeito;
	}
	public String getEquipamentoObservacao() {
		return equipamentoObservacao;
	}
	public void setEquipamentoObservacao(String equipamentoObservacao) {
		this.equipamentoObservacao = equipamentoObservacao;
	}
	public Date getEquipamentoData() {
		return equipamentoData;
	}
	public void setEquipamentoData(Date equipamentoData) {
		this.equipamentoData = equipamentoData;
	}
	public String getOrdemDeServicoExterna() {
		return ordemDeServicoExterna;
	}
	public void setOrdemDeServicoExterna(String ordemDeServicoExterna) {
		this.ordemDeServicoExterna = ordemDeServicoExterna;
	}
	public String getEquipamentoStatus() {
		return equipamentoStatus;
	}
	public void setEquipamentoStatus(String equipamentoStatus) {
		this.equipamentoStatus = equipamentoStatus;
	}
	
	

}
