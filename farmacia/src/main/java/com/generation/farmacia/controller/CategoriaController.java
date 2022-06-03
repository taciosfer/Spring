package com.generation.farmacia.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.repository.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar() {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Categoria> buscarId(@PathVariable Long idCategoria) {
		return repository.findById(idCategoria)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/categoria/{nomeCategoria}")
	public ResponseEntity<List<Categoria>> buscarCategoria(@PathVariable String Categoria) {
		return ResponseEntity.ok(repository.findAllByCategoriaContainingIgnoreCase(Categoria));
	}
	@PostMapping
	public ResponseEntity<Categoria> post (@Valid @RequestBody Categoria Categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Categoria));
	}
	@PutMapping
	public ResponseEntity<Categoria> put (@Valid @RequestBody Categoria Categoria) {
		return ResponseEntity.ok(repository.save(Categoria));
	}
	@DeleteMapping("/{idCategoria}")
	public void delete(@PathVariable Long idCategoria) {
		repository.deleteById(idCategoria);
	}
}