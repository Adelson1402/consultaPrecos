package com.first.ink.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.first.ink.Produtos.models.RevendedorEntity;

public interface RevendedorRepository extends CrudRepository<RevendedorEntity, String> {
	
	//essa query faz a busca no banco com parametros iguais aos passados no front end
	@Query(value="select * from tbl_revendedor where nome_revendedor like %?1% ", nativeQuery = true)
	Iterable<RevendedorEntity> findRevendedorEntityByName (String nomeRevendedor);
	RevendedorEntity findByCodigoRevendedor (long codigoRevendedor);
	

}
