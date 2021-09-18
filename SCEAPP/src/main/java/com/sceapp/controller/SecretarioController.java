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

import com.sceapp.model.Secretario;
import com.sceapp.repository.SecretarioRepository;

@RestController
@RequestMapping("/secretarios")
public class SecretarioController {
	
	@Autowired
	private SecretarioRepository secretarioRepository;
	
	@GetMapping
	public List<Secretario> listar() {
		return secretarioRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Secretario cadastrar(@RequestBody Secretario secretario) {
		return secretarioRepository.save(secretario);
	}
}
