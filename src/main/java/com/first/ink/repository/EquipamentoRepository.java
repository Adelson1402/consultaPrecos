package com.first.ink.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.first.ink.Produtos.models.Equipamentos;

public interface EquipamentoRepository extends CrudRepository<Equipamentos, String> {
	
	@Query(value="select * from equipamentos where ordemDeServicoExterna like %?1%", nativeQuery= true)
	Iterable<Equipamentos> findEquipamentosByEquipamentoModelo(String equipamentoModelo);

	Equipamentos findByEquipamentoID(long equipamentoID);
    
	
	Equipamentos findEquipamentosByOrdemDeServicoExterna(String orderDeServicoExterna);
	
	Equipamentos findEquipamentosByOrdemDeServicoExterna(int i);
	

	

	

	
	
	

}
