package com.example.noteservice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.noteservice.model.Note;
import com.example.noteservice.model.NotesRowMapper;

@Repository
public class NoteDaoImpl implements NoteDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	List<Note> notes;

	public NoteDaoImpl() {
		notes = new ArrayList<>();
		/*
		 * notes.add(new Note(9001, "Kumar", "Microservices",
		 * "Best tool for orchestration")); notes.add(new Note(9002, "Anil", "Kafka",
		 * "Best tool for large data")); notes.add(new Note(9003, "Pavan", "MySQL",
		 * "Best tool for Database"));
		 */
	}

	@Override
	public Note addNote(Note note) {
		// TODO Auto-generated method stub
		// notes.add(note);
		String sql = "insert into notes values (?,?,?,?)";
		int k = jdbcTemplate.update(sql, note.getNoteId(), note.getAuthor(), note.getTitle(), note.getDescription());
		if (k == 1)
			return note;
		else
			return null;

	}

	@Override
	public List<Note> searchNote(int noteId) {
		// TODO Auto-generated method stub
		List<Note> nts = displayNotes() ;
		List<Note> result = nts.stream().filter(n->n.getNoteId()==noteId).map(x->x).collect(Collectors.toList());
		return result;
	}

	@Override
	public boolean deleteNote(int noteId) {
		// TODO Auto-generated method stub
		/*
		 * boolean isFound = false; for (Note note : notes) { if (note.getNoteId() ==
		 * noteId) { notes.remove(note); isFound = true; } } return isFound;
		 */
		String sql = "delete from notes where noteid = ?";
		int k = jdbcTemplate.update(sql, noteId);
		if (k == 1)
			return true;
		else
			return false;

	}

	@Override
	public List<Note> displayNotes() {
		// TODO Auto-generated method stub
		String sql = "select * from notes";
		NotesRowMapper mapper = new NotesRowMapper();
		return jdbcTemplate.query(sql,mapper);
		
	}

}