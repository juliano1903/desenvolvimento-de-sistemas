package br.com.leilaoeletronico.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.leilaoeletronico.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
