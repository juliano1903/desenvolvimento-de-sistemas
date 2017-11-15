package br.com.leilaoeletronico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	private Long idProduto;
	
	private String descBreve;
	
	private String descCompleta;
}
