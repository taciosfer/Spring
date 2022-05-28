package com.generation.blogpessoal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController //Define que se trata de uma Classe Controller.
@RequestMapping("/posts") //Caminho/URI a ser usado para acessar essa Classe.
@CrossOrigin("*") //Para que essa Classe aceite requisições de diferentes origens p.ex.: Angular, React.
public class PostagemController
{
	@Autowired //Garante que todos os serviços da Interface sejam acessados pela Controller.
	public PostagemRepository repository;
	@GetMapping //Método que vai ser executado quando for dado o Request usando /posts
	public ResponseEntity<List<Postagem>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
}