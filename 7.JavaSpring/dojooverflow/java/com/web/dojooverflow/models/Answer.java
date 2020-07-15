package com.web.dojooverflow.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.web.dojooverflow.models.Question;

@Entity
@Table(name="answers")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  private String answer;
  @Column(updatable=true)
  private Date createdAt;
  private Date updatedAt;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="question_id")
  private Question question;

  public Answer() {}
	public Answer(String answer, Question question) {
		super();
		this.answer = answer;
		this.question = question;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Question getQuestions() {
		return question;
	}
	public void setQuestions(Question question) {
		this.question = question;
	}
}











