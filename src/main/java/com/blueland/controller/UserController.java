package com.blueland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blueland.model.Member;
import com.blueland.model.Staff;
import com.blueland.model.User;
import com.blueland.model.Maths;
import com.blueland.model.Question;
import com.blueland.model.English1;
import com.blueland.service.English1Service;
import com.blueland.service.MathsService;
import com.blueland.service.MemberService;
import com.blueland.service.QuestionService;
import com.blueland.service.StaffService;
import com.blueland.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	

	
	StaffService staffService;
	MemberService memberService;
	MathsService mathsService;
	English1Service english1Service;
	QuestionService questionService;

	public UserController(StaffService staffService, MemberService memberService, MathsService mathsService, 
			English1Service english1Service, QuestionService questionService) {
		this.memberService = memberService;
		this.staffService = staffService;
		this.mathsService = mathsService;
		this.english1Service = english1Service;
		this.questionService = questionService;
	}
	
	
	@RequestMapping(value = {"/staffs"}, method = RequestMethod.GET)
	public String listStaffs(Model model) {
		model.addAttribute("staffs", staffService.getAllStaffs());
		return "user/staffs";
	}
	
	@RequestMapping(value = {"/staffs/new"}, method = RequestMethod.GET)
	public String createStaffForm(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "user/create_staff";
	}

 @RequestMapping(value = {"/staffs"}, method = RequestMethod.POST)
public String saveStaff(@ModelAttribute("staff") Staff staff) {
	 staffService.saveStaff(staff);
	return "redirect:/staffs";
}

 @RequestMapping(value = {"/staffs/edit/{id}"}, method = RequestMethod.GET)
public String editStaffForm(@PathVariable Long id, Model model) {
	model.addAttribute("staff", staffService.getStaffById(id));
	return "user/edit_staff";
}

 @RequestMapping(value = {"/staffs/{id}"}, method = RequestMethod.POST)
public String updateStaff(@PathVariable Long id, 
		@ModelAttribute("staff") Staff staff,
		Model model) {
	
	//get staffs from database by id
	 Staff existingStaff = staffService.getStaffById(id);
	existingStaff.setId(id);
	existingStaff.setFirstName(staff.getFirstName());
	existingStaff.setLastName(staff.getLastName());
	existingStaff.setEmail(staff.getEmail());
	existingStaff.setMobile(staff.getMobile());
	existingStaff.setDegree(staff.getDegree());
	existingStaff.setSubject(staff.getSubject());
	existingStaff.setPosition(staff.getPosition());
	existingStaff.setDoa(staff.getDoa());
	existingStaff.setDob(staff.getDob());
	existingStaff.setAnnual(staff.getAnnual());
	
	
	//save updated staff object 
	staffService.updateStaff(existingStaff);
	return "redirect:/staffs";
}

// handler method to handle delete staff request

 @RequestMapping(value = {"/staffs/{id}"}, method = RequestMethod.GET)
	public String Staff(@PathVariable Long id) {
	staffService.deleteStaffById(id);
	return "redirect:/staffs";
 }
 
 

	
	

 
 
 
	@RequestMapping(value = {"/mathss"}, method = RequestMethod.GET)
	public String listMathss(Model model) {
		model.addAttribute("mathss", mathsService.getAllMathss());
		return "user/scorejssonemaths";
	}
	
	@RequestMapping(value = {"/mathss/new"}, method = RequestMethod.GET)
	public String createMathsForm(Model model) {
		Maths maths = new Maths();
		model.addAttribute("maths",maths);
		return "user/create_maths";
	}

@RequestMapping(value = {"/mathss"}, method = RequestMethod.POST)
public String saveMaths(@ModelAttribute("maths") Maths maths) {
	mathsService.saveMaths(maths);
	return "redirect:/mathss";
}

@RequestMapping(value = {"/mathss/edit/{id}"}, method = RequestMethod.GET)
public String editMathsForm(@PathVariable Long id, Model model) {
	model.addAttribute("maths", mathsService.getMathsById(id));
	return "user/edit_maths";
}

@RequestMapping(value = {"/mathss/{id}"}, method = RequestMethod.POST)
public String updateMaths(@PathVariable Long id, 
		@ModelAttribute("maths") Maths maths,
		Model model) {
	
	//get maths from database by id
	Maths existingMaths = mathsService.getMathsById(id);
	existingMaths.setId(id);
	existingMaths.setFirstName(maths.getFirstName());
	existingMaths.setTest(maths.getTest());
	existingMaths.setExam(maths.getExam());
	existingMaths.setTotal(maths.getTotal());
	existingMaths.setGrade(maths.getGrade());
	
	
	
	//save updated maths object 
	mathsService.updateMaths(existingMaths);
	return "redirect:/mathss";
}

//handler method to handle delete maths request

@RequestMapping(value = {"/mathss/{id}"}, method = RequestMethod.GET)
	public String Maths(@PathVariable Long id) {
	mathsService.deleteMathsById(id);
	return "redirect:/mathss";
}
 
 
 
 
	
	




@RequestMapping(value = {"/english1s"}, method = RequestMethod.GET)
public String listEnglish1s(Model model) {
	model.addAttribute("english1s", english1Service.getAllEnglish1s());
	return "user/scorejssoneenglish1";
}

@RequestMapping(value = {"/english1s/new"}, method = RequestMethod.GET)
public String createEnglish1Form(Model model) {
	English1 english1 = new English1();
	model.addAttribute("english1",english1);
	return "user/create_english1";
}

@RequestMapping(value = {"/english1s"}, method = RequestMethod.POST)
public String saveEnglish1(@ModelAttribute("english1") English1 english1) {
	english1Service.saveEnglish1(english1);
return "redirect:/english1s";
}

@RequestMapping(value = {"/english1s/edit/{id}"}, method = RequestMethod.GET)
public String editEnglish1Form(@PathVariable Long id, Model model) {
model.addAttribute("english1", english1Service.getEnglish1ById(id));
return "user/edit_english1";
}

@RequestMapping(value = {"/english1s/{id}"}, method = RequestMethod.POST)
public String updateEnglish1(@PathVariable Long id, 
	@ModelAttribute("english1") English1 english1,
	Model model) {

//get maths from database by id
English1 existingEnglish1 = english1Service.getEnglish1ById(id);
existingEnglish1.setId(id);
existingEnglish1.setFirstName(english1.getFirstName());
existingEnglish1.setTest(english1.getTest());
existingEnglish1.setExam(english1.getExam());
existingEnglish1.setTotal(english1.getTotal());
existingEnglish1.setGrade(english1.getGrade());



//save updated maths object 
english1Service.updateEnglish1(existingEnglish1);
return "redirect:/english1s";
}

//handler method to handle delete maths request

@RequestMapping(value = {"/english1s/{id}"}, method = RequestMethod.GET)
public String English1(@PathVariable Long id) {
	english1Service.deleteEnglish1ById(id);
return "redirect:/english1s";
}












@RequestMapping(value = {"/questions"}, method = RequestMethod.GET)
public String Questions(Model model, 
  		 @Param("keyword") String keyword) {
  	 List<Question> listQuestions = questionService.getAllQuestions(keyword);
  	 model.addAttribute("listQuestions", listQuestions);
  	 model.addAttribute("keyword", keyword);
  	model.addAttribute("questions",questionService.getAll());
  	return "user/question";
}

@RequestMapping(value = {"/questions/new"}, method = RequestMethod.GET)
public String createQuestionForm(Model model) {
	Question question = new Question();
	model.addAttribute("question",question);
	return "user/create_question";
}

@RequestMapping(value = {"/questions"}, method = RequestMethod.POST)
public String saveQuestion(@ModelAttribute("question") Question question) {
	questionService.saveQuestion(question);
return "redirect:/questions";
}

@RequestMapping(value = {"/questions/edit/{id}"}, method = RequestMethod.GET)
public String editQuestionForm(@PathVariable Long id, Model model) {
model.addAttribute("question", questionService.getQuestionById(id));
return "user/edit_question";
}

@RequestMapping(value = {"/questions/{id}"}, method = RequestMethod.POST)
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
return "redirect:/questions";
}

//handler method to handle delete maths request

@RequestMapping(value = {"/questions/{id}"}, method = RequestMethod.GET)
public String Question(@PathVariable Long id) {
	questionService.deleteQuestionById(id);
return "redirect:/questions";
}








	
	
		
		
    @RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
    public String homePage(){
        return "user/dashboard";
    }

    @RequestMapping(value = {"/class"}, method = RequestMethod.GET)
    public String levels(){
        return "user/class";
    }
    
    @RequestMapping(value = {"/question"}, method = RequestMethod.GET)
    public String question(){
        return "user/question";
    }
    
    
	 
    @RequestMapping(value = {"/user/jssone"}, method = RequestMethod.GET)
    public String jssone(){
        return "user/jssone";
    }
    
    
    
    
    
    
    @RequestMapping(value = {"/user/jsstwo"}, method = RequestMethod.GET)
    public String jsstwo(){
        return "user/jsstwo";
    }
    
    @RequestMapping(value = {"/user/jssthree"}, method = RequestMethod.GET)
    public String jssthree(){
        return "user/jssthree";
    }
    
    @RequestMapping(value = {"/user/ssone"}, method = RequestMethod.GET)
    public String ssone(){
        return "admin/ssone";
    }
    
    @RequestMapping(value = {"/user/sstwo"}, method = RequestMethod.GET)
    public String sstwo(){
        return "user/sstwo";
    }
    
    @RequestMapping(value = {"/user/ssthree"}, method = RequestMethod.GET)
    public String ssthree(){
        return "user/ssthree";
    }

	
	@RequestMapping(value = {"/members"}, method = RequestMethod.GET)
	public String listMembers(Model model) {
		return findPaginated(1, "firstName", "asc", model);
	}

	@RequestMapping(value = {"/members/new"}, method = RequestMethod.GET)
	public String createMemberForm(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		return "user/create_member";
	}
	
	 @RequestMapping(value = {"/members"}, method = RequestMethod.POST)
	public String saveMember(@ModelAttribute("member") Member member) {
		memberService.saveMember(member);
		return "redirect:/members";
	}
	
	 @RequestMapping(value = {"/members/edit/{id}"}, method = RequestMethod.GET)
	public String editMemberForm(@PathVariable Long id, Model model) {
		model.addAttribute("member", memberService.getMemberById(id));
		return "user/edit_member";
	}
	
	 @RequestMapping(value = {"/members/{id}"}, method = RequestMethod.POST)
	public String updateMember(@PathVariable Long id, 
			@ModelAttribute("member") Member member,
			Model model) {
		
		//get members from database by id
		Member existingMember = memberService.getMemberById(id);
		existingMember.setId(id);
		existingMember.setFirstName(member.getFirstName());
		existingMember.setLastName(member.getLastName());
		existingMember.setEmail(member.getEmail());
		existingMember.setAdmissionNumber(member.getAdmissionNumber());
		existingMember.setLevel(member.getLevel());
		existingMember.setPosition(member.getPosition());
		existingMember.setDepartment(member.getDepartment());
		existingMember.setFeeBal(member.getFeeBal());
		existingMember.setTotal(member.getTotal());
		existingMember.setPercentage(member.getPercentage());
		
		
		//save updated student object 
		memberService.updateMember(existingMember);
		return "redirect:/members";
	}
	
	// handler method to handle delete member request

	 @RequestMapping(value = {"/members/{id}"}, method = RequestMethod.GET)
		public String deleteMember(@PathVariable Long id) {
		memberService.deleteMemberById(id);
		return "redirect:/members";
	}
	
	 @RequestMapping(value = {"/page/{pageNo}"}, method = RequestMethod.GET)
	 public String findPaginated(@PathVariable (value = "pageNo") int pageNo,
			 @RequestParam("sortField") String sortField,
			 @RequestParam("sortDir") String sortDir,
			 Model model) {
		 int pageSize = 8;
		 
		 Page<Member> page = memberService.findPaginated(pageNo, pageSize, sortField, sortDir);
		 List<Member> listMembers = page.getContent();
		 
		 
	
		 model.addAttribute("currentPage", pageNo);
		 model.addAttribute("totalPages", page.getTotalPages());
		 model.addAttribute("totalItems", page.getTotalElements());
		 
		 model.addAttribute("sortField", sortField);
		 model.addAttribute("sortDirection", sortDir);
		 model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "des" : "asc");
		 
		 
		 model.addAttribute("listMembers", listMembers);
		 return "user/members";	 
		 
	 } 
	 
}
