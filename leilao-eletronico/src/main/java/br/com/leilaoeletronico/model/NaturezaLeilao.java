package br.com.leilaoeletronico.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="natureza_leilao")
public class NaturezaLeilao {

	@Id
	private Long idNaturezaLeilao;
	
	private String nome;
	
	private String descricao;
}
