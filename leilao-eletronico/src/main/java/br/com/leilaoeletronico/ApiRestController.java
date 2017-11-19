package br.com.leilaoeletronico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.leilaoeletronico.model.Lance;
import br.com.leilaoeletronico.model.Leilao;
import br.com.leilaoeletronico.service.LanceService;

@RestController
@RequestMapping("lance")
public class ApiRestController {
	
	@Autowired
	private LanceService lanceService;

    @RequestMapping(value = "/{idLeilao}", method = RequestMethod.GET, produces = "application/json")
    public List<Lance> getLances(@PathVariable Long idLeilao) {
    	Iterable<Lance> lances = lanceService.findByIdLeilao(new Leilao().builder().idLeilao(idLeilao).build());
    	List<Lance> retorno = new ArrayList<Lance>();
    	for (Lance lance : lances) {
        	retorno.add(new Lance().builder().valorString(lance.getValorString()).dataHora(lance.getDataHora()).build());    		
    	}
 
    	return retorno;
    }
}
