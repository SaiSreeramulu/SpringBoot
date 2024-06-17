package com.example.noteservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.noteservice.dao.NoteDao;
import com.example.noteservice.model.Note;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	NoteDao dao;

	List<Note> notes;

	public NoteServiceImpl() {

	}

	@Override
	public Note addNote(@RequestBody Note note) {
		// TODO Auto-generated method stub
		return dao.addNote(note);

	}

	@Override
	public List<Note> searchNote(int noteId) {
		// TODO Auto-generated method stub
		return dao.searchNote(noteId);

	}

	@Override
	public boolean deleteNote(int noteId) {
		// TODO Auto-generated method stub
		return dao.deleteNote(noteId);
	}

	@Override
	public List<Note> displayNotes() {
		// TODO Auto-generated method stub
		return dao.displayNotes();
	}

}