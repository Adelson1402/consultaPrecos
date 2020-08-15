package com.first.ink.Produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.first.ink.Produtos.models.RevendedorEntity;
import com.first.ink.repository.RevendedorRepository;

@Controller
public class RevendedorController {
	
	@Autowired
	private RevendedorRepository rr;
	
	@RequestMapping(value="/revendedor", method=RequestMethod.GET)
	public String revendedor() {
		return "revendedor";
		
		
	}
	
	@RequestMapping(value="/revendedor", method=RequestMethod.POST)
	public String revendedor(RevendedorEntity revendedorEntity) {
		
		rr.save(revendedorEntity);
		return "redirect:/revendedor";
	}
	//lista os revendedores em uma tabela//
	@RequestMapping(value="/revendedores")
	public ModelAndView listaRevendedor() {
		ModelAndView mvc = new ModelAndView("listarRevendedores");
		Iterable<RevendedorEntity> listRev = rr.findAll();
		mvc.addObject("revend", listRev);
		return mvc;
	
	}

}
