package com.example.noteservice.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class NoteConfigs {
	
	@Bean
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(createDataSource() );
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource createDataSource() {
	  	DriverManagerDataSource ds = new DriverManagerDataSource();
	 	//ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	 	// if you are using oracle add the below line
	 	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 	//ds.setUrl("jdbc:mysql://localhost:3306/wiprodb");
	 	// add below line for Oracle db
	 	ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
	 	//ds.setUsername("root");
	 	//add below line for oralce
	 	 ds.setUsername("system");
	 	//ds.setPassword("root");
	 	//add below line for oracle
	 	 ds.setPassword("orcl");
	 	
	 	return ds;
		
	}

}