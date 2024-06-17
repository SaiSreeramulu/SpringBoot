package com.example.noteservice.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Note {
	
	@NotNull(message="Note Id cannot be null value")
	int noteId;
	@NotNull(message="Author cannot be null")
	String author;
	@NotNull(message="Title cannot be null")
	String title;
	@NotNull(message="description cannot be null")
	@Size(min=20, message="Min 20 characters required")
	@Size(max=250, message="Max 250 characters allowed")
	String description;
	
	public Note() {
		
	}

	public Note(int noteId, String author, String title, String description) {
		super();
		this.noteId = noteId;
		this.author = author;
		this.title = title;
		this.description = description;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}