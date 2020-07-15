package com.web.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.dojooverflow.models.Answer;
import com.web.dojooverflow.models.Question;
import com.web.dojooverflow.models.Tag;
import com.web.dojooverflow.models.TagQuestion;
import com.web.dojooverflow.repositories.AnswerRepository;
import com.web.dojooverflow.repositories.QuestionRepository;
import com.web.dojooverflow.repositories.TagRepository;
import com.web.dojooverflow.repositories.TagQuestionRepository;

@Service
public class MainService {
	private final QuestionRepository repositoryQ;
	private final AnswerRepository repositoryA;
	private final TagRepository repositoryT;
	private final TagQuestionRepository repositoryTQ;
	
	public MainService(
			AnswerRepository repositoryA, 
			QuestionRepository repositoryQ, 
			TagRepository repositoryT, 
			TagQuestionRepository repositoryTQ) {
		this.repositoryA = repositoryA;
		this.repositoryQ = repositoryQ;
		this.repositoryT = repositoryT;
		this.repositoryTQ = repositoryTQ;
	}
//-------------------------------------CREATE METHODS
	public void create(Question entity) {
		repositoryQ.save(entity);
	}
	public void create(Answer entity) {
		repositoryA.save(entity);
	}
	public void create(Tag entity) {
		repositoryT.save(entity);
	}
	public void create(TagQuestion entity) {
		repositoryTQ.save(entity);
	}
	
//---------------------------------------FINDALL METHODS
	public List<Question> showQuestions(){
		return repositoryQ.findAll();
	}
	public List<Answer> showAnswers(){
		return repositoryA.findAll();
	}
	
//---------------------------------------FINDbyID METHODS
	public Question findoneQuestion(Long id) {
		Optional<Question> o = repositoryQ.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}
}










