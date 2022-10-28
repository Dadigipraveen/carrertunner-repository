package com.ct.nsa.entity;

public class Scholarship {
	
	private int scholarshipId;
	private String scholarshipName;		//Prime Minister Scholarship Scheme/SwarnaJayanti Fellowships Scheme, etc..
	private String field;		// Medical, Law, Engineering
	private String course;		// LLB, MBA, MBBS, BE, BTech, MTech, BCA
	private int courseYear;		// Current course year
	private double sscScore;
	private double hscScore;
	private double familyIncome;
	private String bankName;
	private String bankIfsc;
	private String accountNo;
	private Student student;
	private Institution institute;
	private String appStatus;		// Pending/Approved/Rejected
	private String approval;// Pending/Granted
	
	
	

	public Scholarship() {

	}
	public Scholarship(int code, String category, String type, String name, String university, String address,
			String city, String state, String yearopen, String telephone, String principal, String status) {

	}
	public int getScholarshipId() {
		return scholarshipId;
	}
	public void setScholarshipId(int scholarshipId) {
		this.scholarshipId = scholarshipId;
	}
	public String getScholarshipName() {
		return scholarshipName;
	}
	public void setScholarshipName(String scholarshipName) {
		this.scholarshipName = scholarshipName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}
	public double getSscScore() {
		return sscScore;
	}
	public void setSscScore(double sscScore) {
		this.sscScore = sscScore;
	}
	public double getHscScore() {
		return hscScore;
	}
	public void setHscScore(double hscScore) {
		this.hscScore = hscScore;
	}
	public double getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIfsc() {
		return bankIfsc;
	}
	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Institution getInstitute() {
		return institute;
	}
	public void setInstitute(Institution institute) {
		this.institute = institute;
	}
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public void Scholorship(int scholarshipId, String scholarshipName, String field, String course, int courseYear,
			double sscScore, double hscScore, double familyIncome, String bankName, String bankIfsc, String accountNo,
			Student student, Institution institute, String appStatus, String approval) {
		
		this.scholarshipId = scholarshipId;
		this.scholarshipName = scholarshipName;
		this.field = field;
		this.course = course;
		this.courseYear = courseYear;
		this.sscScore = sscScore;
		this.hscScore = hscScore;
		this.familyIncome = familyIncome;
		this.bankName = bankName;
		this.bankIfsc = bankIfsc;
		this.accountNo = accountNo;
		this.student = student;
		this.institute = institute;
		this.appStatus = appStatus;
		this.approval = approval;
	}
	@Override
	public String toString() {
		return "Scholorship [scholarshipId=" + scholarshipId + ", scholarshipName=" + scholarshipName + ", field="
				+ field + ", course=" + course + ", courseYear=" + courseYear + ", sscScore=" + sscScore + ", hscScore="
				+ hscScore + ", familyIncome=" + familyIncome + ", bankName=" + bankName + ", bankIfsc=" + bankIfsc
				+ ", accountNo=" + accountNo + ", student=" + student + ", institute=" + institute + ", appStatus="
				+ appStatus + ", approval=" + approval + "]";
	}

}
