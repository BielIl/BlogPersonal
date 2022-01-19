package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_posts")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPost;
	
	@NotNull
	@Size(min = 8, max = 128)
	private String titlePost;
	
	@NotNull
	@Size(min = 32, max = 512)
	private String textPost;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datePost = new java.sql.Date(System.currentTimeMillis());

	public long getIdPost() {
		return idPost;
	}

	public void setIdPost(long idPost) {
		this.idPost = idPost;
	}

	public String getTitlePost() {
		return titlePost;
	}

	public void setTitlePost(String titlePost) {
		this.titlePost = titlePost;
	}

	public String getTextPost() {
		return textPost;
	}

	public void setTextPost(String textPost) {
		this.textPost = textPost;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	
}
