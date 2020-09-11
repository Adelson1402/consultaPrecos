package com.first.ink.Produto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.first.ink.Produtos.models.RevendedorEntity;
import com.first.ink.repository.RevendedorRepository;

@Controller
public class RevendedorController {
	//injeta o repositorio 
	@Autowired
	private RevendedorRepository rr;
	
	@RequestMapping(value="/revendedor", method=RequestMethod.GET)
	public String revendedor() {
		return "revendedor";
		
		
	}
	//salva o revendedor
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
	//filtra o revendedor pelo nome
	@PostMapping(value="/filtraRevendedor")
	public ModelAndView filtraRevendedor(@RequestParam("filtroRevendedor") String filtroRevendedor) {
		ModelAndView mvc = new ModelAndView("listarRevendedores");
		mvc.addObject("revend", rr.findRevendedorEntityByName(filtroRevendedor));
		return mvc;
	}
    //deleta o revendedor
	@RequestMapping(value="/deletaRevendedor")
	public String deletaRevendedor(long codigoRevendedor) {
		RevendedorEntity revendedorEntity = rr.findByCodigoRevendedor(codigoRevendedor);
		rr.delete(revendedorEntity);
		return "redirect:/revendedores";
		
		
	}
	
}
