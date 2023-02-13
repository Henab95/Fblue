package com.blueland.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staffs")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String LastName;
	
	@Column(name = "email")
	private String Email;
	
	@Column(name = "mobile")
	private String Mobile;
	
	@Column(name = "degree")
	private String Degree;
	
	@Column(name = "subject")
	private String Subject;
	
	@Column(name = "position")
	private String Position;
	
	@Column(name = "doa")
	private String Doa;
	
	@Column(name = "dob")
	private String Dob;
	
	@Column(name = "annual")
	private String Annual;
	
	public Staff() {
		
	}

	public Staff(String firstName, String lastName, String email, String mobile, String degree, String subject,
			String position, String doa, String dob, String annual) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		Email = email;
		Mobile = mobile;
		Degree = degree;
		Subject = subject;
		Position = position;
		Doa = doa;
		Dob = dob;
		Annual = annual;
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

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getDoa() {
		return Doa;
	}

	public void setDoa(String doa) {
		Doa = doa;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getAnnual() {
		return Annual;
	}

	public void setAnnual(String annual) {
		Annual = annual;
	}

}

