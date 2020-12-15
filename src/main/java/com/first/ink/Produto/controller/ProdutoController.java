package com.first.ink.Produto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.first.ink.Produtos.models.Produtos;
import com.first.ink.repository.ProdutoRepository;


@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository pr;
	
	
	@RequestMapping(value="/cadastrarProdutos", method=RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mvc = new ModelAndView("formProduto");
		mvc.addObject("prodobj", new Produtos());
		return mvc;
	}
//salva um produto no banco de dados
	@RequestMapping(value="**/cadastrarProduto")
	public String form(Produtos produtos) {
		
		pr.save(produtos);
		
		
		
		return "redirect:/cadastrarProdutos";
	}
	
	
	//renderiza uma lista de produtos em "index"
	@RequestMapping("/produtos")
	public ModelAndView listaProdutos() {
		ModelAndView mvc = new ModelAndView("index");
		Iterable<Produtos> listProd = pr.findAll();
		mvc.addObject("prods", listProd);
		
		return mvc;
		
	}
	//filtra um produto
	@PostMapping("/filtrar")
	public ModelAndView filtro(@RequestParam("filtro") String filtro) {
		ModelAndView mvc = new ModelAndView("index");
		mvc.addObject("prods", pr.findProdutosByName(filtro));
		mvc.addObject("prodobj", new Produtos());
		
		
		return mvc;
		
	}
	
	
	
//deleta um produto
	@RequestMapping(value="/deletar")
	public String deletarProduto( long codigo) {
		Produtos produto = pr.findByCodigo(codigo);
		pr.delete(produto);
		
		return "redirect:/produtos";
		
}
	
	//edita um produto
	@RequestMapping(value="/editarProduto/{codigo}")
	public ModelAndView editarProduto(@PathVariable("codigo") long codigo) {
		Produtos produtos = pr.findByCodigo(codigo);
		ModelAndView mvc = new ModelAndView("formProduto");
		mvc.addObject("prodobj",produtos);
	    
		
		return mvc;
		
		
	}
}