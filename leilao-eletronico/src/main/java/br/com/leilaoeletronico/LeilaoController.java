package br.com.leilaoeletronico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeilaoController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("buscaleiloes")
	public String buscaLeiloes(){
		return "buscaLeiloes";
	}
	
	@RequestMapping("crialeilao")
	public String criaLeilao(){
		return "crialeilao";
	}
	
	@RequestMapping("crialeilaoconfirmar")
	public String criaLeilaoConfirmar(){
		return "crialeilaoconfirmar";
	}
	
}
