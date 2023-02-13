package com.blueland.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rollNo", nullable = false)
	private String rollNo;
	
	@Column(name = "s1")
	private int S1;
	
	@Column(name = "s2")
	private int S2;
	
	@Column(name = "s3")
	private int S3;
	
	@Column(name = "s4")
	private int S4;
	
	@Column(name = "s5")
	private int S5;
	
	@Column(name = "s6")
	private int S6;
	
	@Column(name = "s7")
	private int S7;
	
	@Column(name = "s8")
	private int S8;
	
	@Column(name = "s9")
	private int S9;
	
	@Column(name = "s10")
	private int S10;
	
	@Column(name = "s11")
	private int S11;
	
	@Column(name = "s12")
	private int S12;
	
	@Column(name = "s13")
	private int S13;
	
	@Column(name = "s14")
	private int S14;
	
	@Column(name = "s15")
	private int S15;
	
	@Column(name = "s16")
	private int S16;
	
	@Column(name = "s17")
	private int S17;
	
	@Column(name = "s18")
	private int S18;
	
	@Column(name = "s19")
	private int S19;
	
	@Column(name = "s20")
	private int S20;
	
	@Column(name = "s21")
	private int S21;
	
	@Column(name = "s22")
	private int S22;
	
	@Column(name = "s23")
	private int S23;
	
	@Column(name = "s24")
	private int S24;
	
	@Column(name = "s25")
	private int S25;
	
	@Column(name = "s26")
	private int S26;
	
	@Column(name = "s27")
	private int S27;
	
	@Column(name = "s28")
	private int S28;
	
	@Column(name = "s29")
	private int S29;
	
	@Column(name = "s30")
	private int S30;
	
	public Question() {
		
	}


	public Question(String rollNo, int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10,
			int s11, int s12, int s13, int s14, int s15, int s16, int s17, int s18, int s19, int s20, int s21, int s22,
			int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30) {
		super();
		this.rollNo = rollNo;
		S1 = s1;
		S2 = s2;
		S3 = s3;
		S4 = s4;
		S5 = s5;
		S6 = s6;
		S7 = s7;
		S8 = s8;
		S9 = s9;
		S10 = s10;
		S11 = s11;
		S12 = s12;
		S13 = s13;
		S14 = s14;
		S15 = s15;
		S16 = s16;
		S17 = s17;
		S18 = s18;
		S19 = s19;
		S20 = s20;
		S21 = s21;
		S22 = s22;
		S23 = s23;
		S24 = s24;
		S25 = s25;
		S26 = s26;
		S27 = s27;
		S28 = s28;
		S29 = s29;
		S30 = s30;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getS1() {
		return S1;
	}

	public void setS1(int s1) {
		S1 = s1;
	}

	public int getS2() {
		return S2;
	}

	public void setS2(int s2) {
		S2 = s2;
	}

	public int getS3() {
		return S3;
	}

	public void setS3(int s3) {
		S3 = s3;
	}

	public int getS4() {
		return S4;
	}

	public void setS4(int s4) {
		S4 = s4;
	}

	public int getS5() {
		return S5;
	}
	
	public void setS5(int s5) {
		S5 = s5;
	}

	public int getS6() {
		return S6;
	}

	public void setS6(int s6) {
		S6 = s6;
	}

	public int getS7() {
		return S7;
	}

	public void setS7(int s7) {
		S7 = s7;
	}
	
	public int getS8() {
		return S8;
	}
	
	public void setS8(int s8) {
		S8 = s8;
	}

	public int getS9() {
		return S9;
	}

	public void setS9(int s9) {
		S9 = s9;
	}

	public int getS10() {
		return S10;
	}
	
	public void setS10(int s10) {
		S10 = s10;
	}

	public int getS11() {
		return S11;
	}

	public void setS11(int s11) {
		S11 = s11;
	}

	public int getS12() {
		return S12;
	}

	public void setS12(int s12) {
		S12 = s12;
	}

	public int getS13() {
		return S13;
	}

	public void setS13(int s13) {
		S13 = s13;
	}
	
	public int getS14() {
		return S14;
	}

	public void setS14(int s14) {
		S14 = s14;
	}
	
	public int getS15() {
		return S15;
	}

	public void setS15(int s15) {
		S15 = s15;
	}
	
	public int getS16() {
		return S16;
	}

	public void setS16(int s16) {
		S16 = s16;
	}

	public int getS17() {
		return S17;
	}


	public void setS17(int s17) {
		S17 = s17;
	}

	public int getS18() {
		return S18;
	}
	
	public void setS18(int s18) {
		S18 = s18;
	}

	public int getS19() {
		return S19;
	}

	public void setS19(int s19) {
		S19 = s19;
	}

	public int getS20() {
		return S20;
	}

	public void setS20(int s20) {
		S20 = s20;
	}

	public int getS21() {
		return S21;
	}
	
	public void setS21(int s21) {
		S21 = s21;
	}

	public int getS22() {
		return S22;
	}

	public void setS22(int s22) {
		S22 = s22;
	}

	public int getS23() {
		return S23;
	}
	
	public void setS23(int s23) {
		S23 = s23;
	}

	public int getS24() {
		return S24;
	}

	public void setS24(int s24) {
		S24 = s24;
	}

	public int getS25() {
		return S25;
	}

	public void setS25(int s25) {
		S25 = s25;
	}

	public int getS26() {
		return S26;
	}

	public void setS26(int s26) {
		S26 = s26;
	}

	public int getS27() {
		return S27;
	}

	public void setS27(int s27) {
		S27 = s27;
	}

	public int getS28() {
		return S28;
	}

	public void setS28(int s28) {
		S28 = s28;
	}
	
	public int getS29() {
		return S29;
	}

	public void setS29(int s29) {
		S29 = s29;
	}

	public int getS30() {
		return S30;
	}

	public void setS30(int s30) {
		S30 = s30;
	}
}
