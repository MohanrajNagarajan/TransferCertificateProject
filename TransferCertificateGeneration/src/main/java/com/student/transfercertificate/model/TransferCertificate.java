package com.student.transfercertificate.model;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "transfer_certificate_details")
public class TransferCertificate  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_no")
    private Long serialNo;
	
	@Column(name = "register_number")
    private int registerNumber;
	
	@NotBlank
    @Size(max = 50)
    @Column(name = "student_name")
    private String studentName;
	
	@NotBlank
    @Size(max = 15)
    @Column(name = "sex")
    private String sex;
	
	@NotBlank
    @Size(max = 50)
    @Column(name = "father_name")
    private String fatherName;
	
	
	@NotBlank
    @Size(max = 50)
    @Column(name = "nationality")
    private String nationality;
	

	@NotBlank
    @Size(max = 50)
    @Column(name = "religion")
    private String religion;
	
	@NotBlank
    @Size(max = 50)
    @Column(name = "community")
    private String community;
	
	@NotBlank
    @Size(max = 50)
    @Column(name = "sub_caste")
    private String subCaste;
	
	@NotBlank
	@Column(name="date_of_birth")
	private String dob;
	
	@NotBlank
	@Column(name="date_of_admission")
	private String dateOfAdmission;
	
	@NotBlank
	@Column(name="course")
	private String course;
	
	@NotBlank
	@Column(name="year")
	private String year;
	
	@NotBlank
	@Column(name="semester")
	private String semester;
	
	@NotBlank
	@Column(name="is_qualified_promotion")
	private String isQualifiedPromotion;
	
	@NotBlank
	@Column(name="conduct")
	private String conduct;
	
	@Column(name="remarks")
	private String remarks;
	
	@NotBlank
	@Column(name="date_of_issuing_tc")
	private String DateOfIssuingTC;
	

	public Long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public int getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getIsQualifiedPromotion() {
		return isQualifiedPromotion;
	}

	public void setIsQualifiedPromotion(String isQualifiedPromotion) {
		this.isQualifiedPromotion = isQualifiedPromotion;
	}

	public String getConduct() {
		return conduct;
	}

	public void setConduct(String conduct) {
		this.conduct = conduct;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDateOfIssuingTC() {
		return DateOfIssuingTC;
	}

	public void setDateOfIssuingTC(String dateOfIssuingTC) {
		DateOfIssuingTC = dateOfIssuingTC;
	}

	@Override
	public String toString() {
		return "TransferCertificate [serialNo=" + serialNo + ", registerNumber=" + registerNumber + ", studentName="
				+ studentName + ", sex=" + sex + ", fatherName=" + fatherName + ", nationality=" + nationality
				+ ", religion=" + religion + ", community=" + community + ", subCaste=" + subCaste + ", dob=" + dob
				+ ", dateOfAdmission=" + dateOfAdmission + ", course=" + course + ", year=" + year + ", semester="
				+ semester + ", isQualifiedPromotion=" + isQualifiedPromotion + ", conduct=" + conduct + ", remarks="
				+ remarks + ", DateOfIssuingTC=" + DateOfIssuingTC + "]";
	}

	
}