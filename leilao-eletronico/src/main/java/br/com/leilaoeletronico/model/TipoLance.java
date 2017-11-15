package br.com.leilaoeletronico.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tipo_lance")
public class TipoLance {
	
	@Id
	public Long idTipoLance;
	
	public String nome;
	
	public String descricao;

}
