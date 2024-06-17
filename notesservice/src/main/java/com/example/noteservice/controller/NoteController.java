package com.example.noteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.noteservice.model.Note;
import com.example.noteservice.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	
	@GetMapping("/display")
	public List<Note> getAllNotes(){
		return service.displayNotes();
	}
	
	@PostMapping("/add")
	public Note addNote(@RequestBody @Valid Note note) {
		return service.addNote(note);
	}
	
	@GetMapping("/search/{noteId}")
	public List<Note> searchNotes(@PathVariable int noteId){
		return service.searchNote(noteId);
	}
	
	@DeleteMapping("/del/{noteId}")
	public boolean deleteNotes(@PathVariable int noteId) {
		return service.deleteNote(noteId);
	}

}