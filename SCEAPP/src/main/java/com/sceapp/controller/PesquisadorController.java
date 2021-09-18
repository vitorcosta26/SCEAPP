package com.sceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.model.Pesquisador;
import com.sceapp.repository.PesquisadorRepository;

@RestController
@RequestMapping("/pesquisadores")
public class PesquisadorController {
	
	@Autowired
	private PesquisadorRepository pesquisadorRepository;
	
	@GetMapping
	public List<Pesquisador> listar() {
		return pesquisadorRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pesquisador cadastrar(@RequestBody Pesquisador pesquisador) {
		return pesquisadorRepository.save(pesquisador);
	}
}
