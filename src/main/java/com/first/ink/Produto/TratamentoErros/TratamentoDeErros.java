package com.first.ink.Produto.TratamentoErros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.first.ink.Produtos.models.Equipamentos;
import com.first.ink.repository.EquipamentoRepository;

public class TratamentoDeErros {
	
	Equipamentos equipamentos = new Equipamentos();
	
	@Autowired
	private EquipamentoRepository er;
	
	
	public boolean UnicaOrdemExterna(@PathVariable("ordemDeServicoExterna") String ordemDeServicoExterna)  {
		
		if(ordemDeServicoExterna.equals(er.findEquipamentosByOrdemDeServicoExterna(ordemDeServicoExterna).getOrdemDeServicoExterna().length() > 0));
		  
		System.out.println("já existe");
		  
		return true;
	}

}
