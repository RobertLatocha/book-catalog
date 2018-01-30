package com.github.robertlatocha.bookcatalog.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class AddBookFormDTO {

	
	@NotBlank
    @Size(min=2, max=30)
	private String title;
	
	@NotBlank
    @Size(min=2, max=30)
	private String author;
	
	@NotBlank
	@Size(min=2, max=30)
	private String genre;

		
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
	
	
}
