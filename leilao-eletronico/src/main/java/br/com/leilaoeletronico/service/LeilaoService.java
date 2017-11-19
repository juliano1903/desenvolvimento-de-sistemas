package br.com.leilaoeletronico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leilaoeletronico.model.Leilao;
import br.com.leilaoeletronico.repository.LeilaoRepository;

@Service
public class LeilaoService {

	@Autowired
	private LeilaoRepository leilaoRepository;
	
	public void save (Leilao leilao) {
		leilaoRepository.save(leilao);
	}

	public Iterable<Leilao> findAll() {
		return leilaoRepository.findAll();
	}
}
