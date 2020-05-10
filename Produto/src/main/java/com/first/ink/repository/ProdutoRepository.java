package com.first.ink.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.first.ink.Produtos.models.Produtos;

public interface ProdutoRepository extends CrudRepository<Produtos, String> {
	@Query(value="select * from tbl_produtos where nome like %?1% ", nativeQuery = true)
	Iterable<Produtos> findProdutosByName(String nome);
}
	
