package br.com.pratics.fiscalizacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fiscal")
public class FiscalController {
	
	
	@GetMapping("/teste")
	public String teste() {
		
		return "Banana";
	}
	
	
}
