package com.blueland.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blueland.model.Question;
import com.blueland.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{

	
	private QuestionRepository questionRepository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> getAllQuestions(String keyword) {
		if(keyword != null) {
		return questionRepository.findAll(keyword);
	}else
		return (List<Question>) questionRepository.findAll();
	}

	@Override
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question getQuestionById(Long id) {
		return questionRepository.findById(id).get();
	}

	@Override
	public Question updateQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public void deleteQuestionById(Long id) {
		questionRepository.deleteById(id);
		
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	
	}
}