package com.first.ink.Produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.first.ink.Produto.TratamentoErros.TratamentoDeErros;
import com.first.ink.Produtos.models.Equipamentos;
import com.first.ink.repository.EquipamentoRepository;

@Controller
public class EquipamentoController {

	@Autowired
	private EquipamentoRepository er;
	
	private TratamentoDeErros tratamentoDeErros;
	
		
	
	@RequestMapping(value="/cadastraEquipamento", method=RequestMethod.GET)
	public String form() {
		
		return "equipamento";
	}
	
	//"salvaEquip" <--- ação para salvar o os dados inseridos
	@RequestMapping(value="**/cadastraEquipamento", method=RequestMethod.POST)
	public String salvaEquip(Equipamentos equipamentos) {
		er.save(equipamentos);
		return "redirect:/listEquip";
	} 
	
	//listar equipamentos
	
	@RequestMapping(value="/listEquip")
	public ModelAndView listaEquip() {
		ModelAndView mvc = new ModelAndView("equipamento");
		Iterable<Equipamentos> listEquip = er.findAll();
		mvc.addObject("equip", listEquip);
		mvc.addObject("equipobj", new Equipamentos());
		return mvc;
		
	}
	
	//editando equipamento
	
	@RequestMapping("**/alterar/{equipamentoID}")
	public ModelAndView alterarEquipamento(@PathVariable("equipamentoID") long equipamentoID) {
		Equipamentos equipamentos = er.findByEquipamentoID(equipamentoID);
		ModelAndView mvc = new ModelAndView("equipamento");
		mvc.addObject("equipobj", equipamentos);
		return mvc;
		
	}
	
	//excluindo equipamento
	
	@RequestMapping(value="/deletarEquipamento")
	public String excluirEquipamento(long equipamentoID) {
		Equipamentos equipamentos = er.findByEquipamentoID(equipamentoID);
		er.delete(equipamentos);
		return "redirect:/listEquip/#tabelaID";
		
		
	}
	
	//buscando equipamento por numero da O.S genesis...
	
	@RequestMapping(value="**/buscaOsGenesis")
	public ModelAndView buscaPelaOsGenesis(@RequestParam("buscaOs") String ordemGenesis) {
		ModelAndView mvc = new ModelAndView("equipamento");
		mvc.addObject("equip", er.findEquipamentosByOrdemDeServicoExterna(ordemGenesis));
		mvc.addObject("equipobj", new Equipamentos());
		return mvc;
		
	}
}

