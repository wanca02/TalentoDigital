package com.web.dojooverflow.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tags_questions")
public class TagQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Question question;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tag_id")
	private Tag tag;
	
	public TagQuestion() {}
	public TagQuestion(Question question, Tag tag) {
		super();
		this.question = question;
		this.tag = tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
}
