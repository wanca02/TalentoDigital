package com.web.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.dojooverflow.models.Answer;
import com.web.dojooverflow.models.Question;
import com.web.dojooverflow.models.Tag;
import com.web.dojooverflow.services.MainService;

@Controller
public class QuestionController {
	private MainService service;
	
	public QuestionController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("/questions")
	public String Dashboard(Model model) {
		List<Question> q = service.showQuestions();
		model.addAttribute("questions",q);
		return "dashboard.jsp";
	}
	@RequestMapping("/questions/{id}")
	public String ShowQuestion(
			@PathVariable("id") Long id,
			Model model) {
		Question q = service.findoneQuestion(id);
		model.addAttribute("question",q);
		return "showQuestion.jsp";
	}
	@RequestMapping(value="/questions/addAnswerQuestion", method=RequestMethod.POST)
	public String FormAnswer(@Valid
			@RequestParam("answer") String answer,
			@RequestParam("questionId") Long questionId) {
		Answer a = new Answer(answer, service.findoneQuestion(questionId));
		service.create(a);
		return "redirect:/questions/"+questionId;
	}
	
	@RequestMapping("/questions/new")
	public String IndexQuestion() {
		return "newQuestion.jsp";
	}
	@RequestMapping(value="/questions/addquestiontag", method=RequestMethod.POST)
	public String FormQuestion(@Valid
			@RequestParam("question") String question,
			@RequestParam("tag") String tag) {
		String[] str = tag.split("\\,",-1);
		//System.out.println(Arrays.toString(str));
		List<Tag> T = new ArrayList<Tag>();
		for(String s : str) {
			service.create(new Tag(s));
			T.add(new Tag(s));
		}
		Question q = new Question(question, T);
		service.create(q);
		return "redirect:/questions/new";
	}
}









