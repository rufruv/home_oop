package hospital;

public class Doctors {
	private String docName, docGen, docPhone, docEmail, docPosition, majorTreat ;
	private int docId ;
	
	public void setDocName(String docName){
		this.docName = docName;
	}
	public String getDocName(){
		return docName ;
	}
	
	public void setDocPhone(String docPhone){
		this.docPhone = docPhone;
	}
	public String getDocPhone(){
		return docPhone ;
	}
	
	public void setDocEmail(String docEmail){
		this.docEmail = docEmail;
	}
	public String getDocEmail(){
		return docEmail ;
	}
	
	public void setDocPosition(String docPosition){
		this.docPosition = docPosition;
	}
	public String getDocPosition(){
		return docPosition ;
	}
	
	public void setMajorTreat(String majorTreat){
		this.majorTreat = majorTreat;
	}
	public String getMajorTreat(){
		return majorTreat ;
	}
	
	public void setDocId(int docId){
		this.docId = docId ;
	}
	public int getDocId(){
		return docId ;
	}
	
	public void calcDocGen(String ssn) {
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			docGen = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			docGen = "남자";
		} else if (ch == '2' || ch == '4') {
			docGen = "여자";
		} else {
			docGen = "외국인";
		}
	}
	public String getDocGen(){
		return docGen ;
	}
	public int getAge(String ssn){
		int year  = Integer.parseInt(ssn.substring(0,2)) + 1900; 
		int age = 2017- year ; 
		return age;
	}
}