package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ContatoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    @Autowired
    ContatoService service;
	
	@GetMapping
	public ResponseEntity<String> ola(){
		return ResponseEntity.status(HttpStatus.OK).body("Ola pessoal");
	}
	
	@ApiOperation("Informe dois numeros que deseja somar")
	@GetMapping("/somar/{n1}/{n2}")
	public ResponseEntity<Integer> soma(@PathVariable("n1") int n1, @PathVariable("n2") int n2 ){
		int resultado = 0;
		resultado = service.somar(n1, n2);
		return ResponseEntity.status(HttpStatus.OK).body(resultado);
	}
	
	@ApiOperation("Informe o nome que deseja cumprimentar")
	@GetMapping("/ola/{nome}")
	public ResponseEntity<String> oi(@PathVariable("nome") String nome){
		return ResponseEntity.status(HttpStatus.OK).body("Ola " + nome);
	}
	
	
}
