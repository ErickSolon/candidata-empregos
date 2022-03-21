package br.com.candidataempregos.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.candidataempregos.model.CandidatosModel;
import br.com.candidataempregos.model.EmpresasModel;
import br.com.candidataempregos.repository.CandidatosRepository;
import br.com.candidataempregos.repository.EmpresasRepository;

@RestController
public class PageRestController {
	@Autowired
	protected CandidatosRepository candidatosRepository;
	
	@Autowired
	protected EmpresasRepository empresasRepository;
	
	@PostMapping(path = "/anunciar", produces = "application/json")
	@ResponseBody
	public void postDataAnuncio(EmpresasModel empresasModel, HttpServletResponse hsr) throws IOException {
		empresasRepository.save(empresasModel);

		hsr.sendRedirect("/anunciar");
	}
	
	@PostMapping(path = "/candidatar", produces = "application/json")
	@ResponseBody
	public void postDataCandidatar(CandidatosModel candidatosModel, HttpServletResponse hsr) throws IOException {
		candidatosRepository.save(candidatosModel);

		hsr.sendRedirect("/candidatar");
	}
}
