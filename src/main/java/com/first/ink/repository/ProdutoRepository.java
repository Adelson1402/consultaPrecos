package com.first.ink.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.first.ink.Produtos.models.Produtos;

public interface ProdutoRepository extends CrudRepository<Produtos, String> {
	@Query(value="select * from tbl_produtos where LOWER(nome) like %?1% OR LOWER(tipo) like %?1% ", nativeQuery = true)
	Iterable<Produtos> findProdutosByName(String nome);

	Produtos findByCodigo(long codigo);
}
	
