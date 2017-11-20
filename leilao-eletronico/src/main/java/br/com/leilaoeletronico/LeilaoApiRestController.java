package br.com.leilaoeletronico;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.leilaoeletronico.model.Leilao;
import br.com.leilaoeletronico.service.LeilaoService;

@RestController
@RequestMapping("leilao")
public class LeilaoApiRestController {
	
	@Autowired
	private LeilaoService leilaoService;

    @RequestMapping(value = "informacoes/{idLeilao}", method = RequestMethod.GET, produces = "application/json")
    public Leilao getInformacoes(@PathVariable Long idLeilao) {
    	Leilao leilao = leilaoService.findByIdLeilao(idLeilao);
    	return leilao;
    }
}
