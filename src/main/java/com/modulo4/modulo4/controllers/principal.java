package com.modulo4.modulo4.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modulo4.modulo4.model.Pessoa;

@RestController
@RequestMapping("api/fuctura")
public class principal {
	@GetMapping("/helloword")
	public ResponseEntity<String> getHelloWrd() {
		return ResponseEntity.ok("Hello Word");
	}
	
	@GetMapping("/pessoa/{id}")
	public ResponseEntity<String> getPessoa(@PathVariable(value = "id")Long id){
		if(id== 1) {
			return ResponseEntity.ok("Pessoa Encontrada");
		}else {
			return ResponseEntity.badRequest().body("Pessoa não encontrada!");
		}
	}
	
	@PostMapping("/pessoa")
	public ResponseEntity<Pessoa> postPessoa(@RequestBody Pessoa pessoa){
		return ResponseEntity.ok().body(pessoa);
	}
	
	
}
