package com.example.noteservice.dao;

import java.util.List;

import com.example.noteservice.model.Note;

public interface NoteDao {
	
	public Note addNote(Note note);
	public List<Note> searchNote(int noteId);
	public boolean deleteNote(int noteId);
	public List<Note> displayNotes();

}