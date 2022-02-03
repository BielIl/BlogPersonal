package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_posts")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 1, max = 128)
	private String tituloPostagem;

	@NotNull
	@Size(min = 1, max = 512)
	private String textoPostagem;

	@ManyToOne
	@JsonIgnoreProperties("Postagem")
	private Tema tema;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datePost = new java.sql.Date(System.currentTimeMillis());

	public long getIdPostagem() {
		return id;
	}

	public void setIdPostagem(long idPostagem) {
		this.id = idPostagem;
	}

	public String getTituloPostagem() {
		return tituloPostagem;
	}

	public void setTituloPostagem(String tituloPostagem) {
		this.tituloPostagem = tituloPostagem;
	}

	public String getTextoPostagem() {
		return textoPostagem;
	}

	public void setTextoPostagem(String textoPostagem) {
		this.textoPostagem = textoPostagem;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}