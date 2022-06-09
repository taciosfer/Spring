package com.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Para o JPA entender que se trata de uma tabela e mapeie;
@Table(name = "tb_usuario") //Para essa tabela ter o nome designado dentro do banco de dados;
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull //Para não receber nenhum nome nulo;
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String usuario;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String senha;//Usa string porque permite caracteres especiais ('array de caracteres')
//CTRL+3+GGAS: atalho para Generate Getters and Setters!
	public long getId() { //O MALDITO DO 'Long'! > > > EXTREMA ATENÇÃO < < <
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}