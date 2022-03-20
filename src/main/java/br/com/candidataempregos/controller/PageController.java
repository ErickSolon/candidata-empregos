package br.com.candidataempregos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping(path = "/")
	public String getIndexPage() {
		return "index.html";
	}
	
	@GetMapping(path = "/anunciar")
	public String getAnunciarPage() {
		return "anunciar.html";
	}
	
	@GetMapping(path = "/candidatar")
	public String getCandidatarPage() {
		return "candidatar.html";
	}
}
