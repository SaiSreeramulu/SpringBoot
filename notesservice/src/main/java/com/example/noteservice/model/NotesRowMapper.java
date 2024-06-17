package com.example.noteservice.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NotesRowMapper implements RowMapper<Note>{

	@Override
	public Note mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Note note = new  Note(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4));
		return note;
	}

}