package com.generation.blogpessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//Criado um Objeto de Postagem!
@Entity //Indica p/ Spring que o Objeto criado vai ser tornar uma tabela no banco de dados.
@Table(name="tb_postagem") //Indica o nome que a tabela vai ter.
public class Postagem
{
	@Id //Indica que o campo 'id' será uma chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Equivale ao AUTO_INCREMENT do MySQL.
	private Long id;
	@NotNull //Não pode ser campo vazio; @NotBlank, atualização, não pode ser vazio e nem espaços!
	private String titulo;
	private String texto;
	private Date data;
	//Depois de todos os atributos definidos, Source->Generate Getters/Setters:
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getTexto()
	{
		return texto;
	}
	public void setTexto(String texto)
	{
		this.texto = texto;
	}
	public Date getData()
	{
		return data;
	}
	public void setData(Date data)
	{
		this.data = data;
	}
}
//Tudo que é feito no Spring é feito por meio de Anotações/Annotations!