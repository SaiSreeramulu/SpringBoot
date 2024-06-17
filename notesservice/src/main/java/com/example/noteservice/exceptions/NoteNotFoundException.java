package com.example.noteservice.exceptions;

public class NoteNotFoundException extends RuntimeException {
	
	public NoteNotFoundException() {
		super("Note data is not found for given note id");
	}

}