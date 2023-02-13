package com.blueland.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "english")
public class English1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "test")
	private String Test;
	
	@Column(name = "exam")
	private String Exam;
	
	@Column(name = "total")
	private String Total;
	
	@Column(name = "grade")
	private String Grade;
	
	
	public English1() {
		
	}


	public English1(String firstName, String test, String exam, String total, String grade) {
		super();
		this.firstName = firstName;
		Test = test;
		Exam = exam;
		Total = total;
		Grade = grade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getTest() {
		return Test;
	}


	public void setTest(String test) {
		Test = test;
	}


	public String getExam() {
		return Exam;
	}


	public void setExam(String exam) {
		Exam = exam;
	}


	public String getTotal() {
		return Total;
	}


	public void setTotal(String total) {
		Total = total;
	}


	public String getGrade() {
		return Grade;
	}


	public void setGrade(String grade) {
		Grade = grade;
	}
	
	
	
}
