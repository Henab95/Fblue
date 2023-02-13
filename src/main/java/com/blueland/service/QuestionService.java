package com.blueland.service;

import java.util.List;

import com.blueland.model.Question;

public interface QuestionService {

List<Question> getAllQuestions(String keyword);

List<Question> getAll();
	
Question saveQuestion(Question question);
	
Question getQuestionById(Long id);
	
Question updateQuestion(Question question);
	
	void deleteQuestionById(Long id);
}
