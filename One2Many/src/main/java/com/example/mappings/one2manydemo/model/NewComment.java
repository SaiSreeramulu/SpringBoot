package com.example.mappings.one2manydemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "new_comments")
public class NewComment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private NewPost post1;
    
	public NewComment() {

	}

	public NewComment(Long id, String text, NewPost post) {
		super();
		this.id = id;
		this.comments = text;
		this.post1 = post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public NewPost getPost() {
		return post1;
	}

	public void setPost(NewPost post) {
		this.post1 = post;
	}

	


}