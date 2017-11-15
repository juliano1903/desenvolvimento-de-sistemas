package br.com.leilaoeletronico.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Usuario {
	
	@Id
	private Long idUsuario;
	
	private String nome;
	
	private String cpf;
	
	private String email;
	
	@OneToMany(mappedBy ="usuario")
	private List<Lance> lances;
}
