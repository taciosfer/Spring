package com.generation.blogpessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.blogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema,Long> { //Entidade: Tema; Tipo do Id: Long.
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);//Método personalizado; Retorna lista do tipo tema; Pega o que o cliente digitar ignorando maiúsculo/minúsculo;
}