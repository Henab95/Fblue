package com.blueland.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String LastName;
	
	@Column(name = "email")
	private String Email;
	
	@Column(name = "admission_number")
	private String AdmissionNumber;
	
	@Column(name = "level")
	private String Level;
	
	@Column(name = "position")
	private String Position;
	
	@Column(name = "department")
	private String Department;
	
	@Column(name = "fee_balance")
	private String FeeBal;
	
	@Column(name = "total")
	private String Total;
	
	@Column(name = "percentage")
	private String Percentage;
	
	public Member() {
		
	}
	
	public Member(String firstName, String lastName, String email, String admissionnumber, String level, String position,
			String department, String feeBal, String total, String percentage) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		Email = email;
		AdmissionNumber = admissionnumber;
		Level = level;
		Position = position;
		Department = department;
		FeeBal = feeBal;
		Total = total;
		Percentage = percentage;
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
	public String getAdmissionNumber() {
		return AdmissionNumber;
	}
	public void setAdmissionNumber(String admissionNumber) {
		AdmissionNumber = admissionNumber;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getFeeBal() {
		return FeeBal;
	}
	public void setFeeBal(String feeBal) {
		FeeBal = feeBal;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	public String getPercentage() {
		return Percentage;
	}
	public void setPercentage(String percentage) {
		Percentage = percentage;
	}


}






