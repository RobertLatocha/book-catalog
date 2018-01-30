package com.github.robertlatocha.bookcatalog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String author;
	
	@NotBlank
	private String genre;
	
	
	public Book() {
		super();
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}
	
}