package br.com.leilaoeletronico.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.leilaoeletronico.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
