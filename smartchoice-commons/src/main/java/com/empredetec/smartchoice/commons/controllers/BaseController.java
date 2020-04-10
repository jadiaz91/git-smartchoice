package com.empredetec.smartchoice.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empredetec.smartchoice.commons.services.IBaseService;

@RestController
public class BaseController<E, S extends IBaseService<E>> {

	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {

		Optional<E> entity = service.findById(id);

		if (!entity.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(entity.get());

	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody E entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
		
		Optional<E> entity = service.findById(id);

		if (!entity.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		service.deleteById(id);
		
		return ResponseEntity.noContent().build();
		
		
	}

}
