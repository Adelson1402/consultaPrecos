package com.first.ink.repository;

import org.springframework.data.repository.CrudRepository;

import com.first.ink.Produtos.models.Equipamentos;

public interface EquipamentoRepository extends CrudRepository<Equipamentos, String> {
	
	
	Iterable<Equipamentos> findEquipamentosByEquipamentoModelo(String equipamentoModelo);

	Equipamentos findByEquipamentoID(long equipamentoID);

	

	

	

	
	
	

}
