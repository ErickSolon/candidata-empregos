package br.com.candidataempregos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.candidataempregos.model.EmpresasModel;
import br.com.candidataempregos.repository.CandidatosRepository;
import br.com.candidataempregos.repository.EmpresasRepository;

@Controller
public class PageController {
	
	@Autowired
	protected EmpresasRepository empresasRepository;
	protected CandidatosRepository candidatosRepository;

	
	@GetMapping(path = "/")
	public String getIndexPage() {
		return "index.html";
	}
	
	@GetMapping(path = "/anunciar")
	public String getAnunciarPage() {
		return "anunciar.html";
	}
	
	@GetMapping("/candidatar")
	public String getCandidatarPage(Model model) {
	    model.addAttribute("empresas", empresasRepository.findAll());
	    return "candidatar.html";
	}
     
}
