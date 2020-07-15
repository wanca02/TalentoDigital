package com.web.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.dojooverflow.models.Answer;
import com.web.dojooverflow.models.Question;
import com.web.dojooverflow.models.Tag;
import com.web.dojooverflow.repositories.AnswerRepository;
import com.web.dojooverflow.repositories.QuestionRepository;
import com.web.dojooverflow.repositories.TagRepository;

@Service
public class MainService {
	private final QuestionRepository repositoryQ;
	private final AnswerRepository repositoryA;
	private final TagRepository repositoryT;
	
	public MainService(
			AnswerRepository repositoryA, 
			QuestionRepository repositoryQ, 
			TagRepository repositoryT) {
		this.repositoryA = repositoryA;
		this.repositoryQ = repositoryQ;
		this.repositoryT = repositoryT;
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










