package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    
	@GetMapping
	public ResponseEntity<String> ola(){
		return ResponseEntity.status(HttpStatus.OK).body("Ola pessoal");
	}
}
