package com.example.mappings.one2manydemo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="new_post")
public class NewPost {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "post1", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NewComment> comments = new ArrayList<>();
    
	public NewPost() {

	}

	public NewPost(Long id, String title, List<NewComment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.comments = comments;
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

	public List<NewComment> getComments() {
		return comments;
	}

	public void setComments(List<NewComment> comments) {
		this.comments = comments;
	}
	


}