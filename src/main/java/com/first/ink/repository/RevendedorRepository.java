package com.first.ink.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.first.ink.Produtos.models.RevendedorEntity;

public interface RevendedorRepository extends CrudRepository<RevendedorEntity, String> {
	@Query(value="select * from tbl_produtos where nome_revendedor like %?1% ", nativeQuery = true)
	Iterable<RevendedorEntity> findRevendedorEntityByName (String nomeRevendedor);
	

}
