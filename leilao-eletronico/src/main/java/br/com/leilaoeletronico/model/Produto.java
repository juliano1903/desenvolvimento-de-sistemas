package br.com.leilaoeletronico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq" )
	@SequenceGenerator(sequenceName = "produto_id_seq", allocationSize = 1, name ="produto_seq")
	private Long idProduto;
	
	private String descBreve;
	
	private String descCompleta;
}
