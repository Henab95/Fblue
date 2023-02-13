package com.blueland.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blueland.model.Question;
import com.blueland.service.QuestionService;

@Controller
public class AdminController {

    @RequestMapping(value = {"/admin/dashboard"}, method = RequestMethod.GET)
    public String adminHome(){
        return "admin/dashboard";
    }
      
    
    @RequestMapping(value = {"/admin/drill"}, method = RequestMethod.GET)
    public String adminDrill(){
        return "admin/drill";
    }
    
    @RequestMapping(value = {"/admin/jssone"}, method = RequestMethod.GET)
    public String jssone(){
        return "admin/jssone";
    }
    
    
    @RequestMapping(value = {"/admin/jsstwo"}, method = RequestMethod.GET)
    public String jsstwo(){
        return "admin/jsstwo";
    }
    
    @RequestMapping(value = {"/admin/jssthree"}, method = RequestMethod.GET)
    public String jssthree(){
        return "admin/jssthree";
    }
    
    @RequestMapping(value = {"/admin/ssone"}, method = RequestMethod.GET)
    public String ssone(){
        return "admin/ssone";
    }
    
    @RequestMapping(value = {"/admin/sstwo"}, method = RequestMethod.GET)
    public String sstwo(){
        return "admin/sstwo";
    }
    
    @RequestMapping(value = {"/admin/ssthree"}, method = RequestMethod.GET)
    public String ssthree(){
        return "admin/ssthree";
    }
    
    
    
    
    
    
    
    
    
    QuestionService questionService;
	public AdminController(QuestionService questionService) {
		this.questionService = questionService;		
	}
    
    
    
    @RequestMapping(value = {"/results"}, method = RequestMethod.GET)
    public String views(Model model, 
      		 @Param("keyword") String keyword) {
      	 List<Question> listQuestions = questionService.getAllQuestions(keyword);
      	 model.addAttribute("listQuestions", listQuestions);
      	 model.addAttribute("keyword", keyword);
      	return "admin/results";
    }

    @RequestMapping(value = {"/results/new"}, method = RequestMethod.GET)
    public String createQuestionForm(Model model) {
    	Question question = new Question();
    	model.addAttribute("question",question);
    	return "admin/create_result";
    }

    @RequestMapping(value = {"/results"}, method = RequestMethod.POST)
    public String saveQuestion(@ModelAttribute("question") Question question) {
    	questionService.saveQuestion(question);
    return "redirect:/results";
    }

    @RequestMapping(value = {"/results/edit/{id}"}, method = RequestMethod.GET)
    public String editQuestionForm(@PathVariable Long id, Model model) {
    model.addAttribute("question", questionService.getQuestionById(id));
    return "admin/edit_result";
    }

    @RequestMapping(value = {"/results/{id}"}, method = RequestMethod.POST)
    public String updateQuestion(@PathVariable Long id, 
    	@ModelAttribute("question") Question question,
    	Model model) {

    //get RESULT from database by id
    	Question existingQuestion = questionService.getQuestionById(id);
    existingQuestion.setId(id);
    existingQuestion.setRollNo(question.getRollNo());
    existingQuestion.setS1(question.getS1());
    existingQuestion.setS2(question.getS2());
    existingQuestion.setS3(question.getS3());
    existingQuestion.setS4(question.getS4());
    existingQuestion.setS5(question.getS5());
    existingQuestion.setS6(question.getS6());
    existingQuestion.setS7(question.getS7());
    existingQuestion.setS8(question.getS8());
    existingQuestion.setS9(question.getS9());
    existingQuestion.setS10(question.getS10());
    existingQuestion.setS11(question.getS11());
    existingQuestion.setS12(question.getS12());
    existingQuestion.setS13(question.getS13());
    existingQuestion.setS14(question.getS14());
    existingQuestion.setS15(question.getS15());
    existingQuestion.setS16(question.getS16());
    existingQuestion.setS17(question.getS17());
    existingQuestion.setS18(question.getS18());
    existingQuestion.setS19(question.getS19());
    existingQuestion.setS20(question.getS20());
    existingQuestion.setS21(question.getS21());
    existingQuestion.setS22(question.getS22());
    existingQuestion.setS23(question.getS23());
    existingQuestion.setS24(question.getS24());
    existingQuestion.setS25(question.getS25());
    existingQuestion.setS26(question.getS26());
    existingQuestion.setS27(question.getS27());
    existingQuestion.setS28(question.getS28());
    existingQuestion.setS29(question.getS29());
    existingQuestion.setS30(question.getS30());




    //save updated maths object 
    questionService.updateQuestion(existingQuestion);
    return "redirect:/results";
    }

    //handler method to handle delete maths request

    @RequestMapping(value = {"/results/{id}"}, method = RequestMethod.GET)
    public String Question(@PathVariable Long id) {
    	questionService.deleteQuestionById(id);
    return "redirect:/results";
    }


}