package com.first.ink.Produto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListaRevendedorController {
	
	@RequestMapping(value="/listadeRevenda")
	public String listaRevendedor() {
		return "listarRevendedores";
		
	}

}
