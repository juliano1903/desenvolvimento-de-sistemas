package br.com.leilaoeletronico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leilaoeletronico.model.Lance;
import br.com.leilaoeletronico.model.Leilao;
import br.com.leilaoeletronico.repository.LanceRepository;

@Service
public class LanceService {
	
	@Autowired
	public LanceRepository lanceRepository;
		
	public void save(Lance lance) {
		lanceRepository.save(lance);
	}

	public Iterable<Lance> findAll() {
		return lanceRepository.findAll();
	}
	
	public Iterable<Lance> findByIdLeilao(Leilao leilao) {
		return lanceRepository.findByIdLeilao(leilao);
	}
}
