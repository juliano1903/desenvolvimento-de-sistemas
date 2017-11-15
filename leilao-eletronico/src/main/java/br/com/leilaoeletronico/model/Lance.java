package br.com.leilaoeletronico.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Lance {

	@Id
	private Long idLance;
	
	private Date dataHora;
	
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
}
