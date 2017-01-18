package hospital;

public class Nurses {
	private String nurName, nurGen, nurPhone, nurEmail, nurPosition, majorJob ;
	private int nurId;
	
	public void setNurName(String nurName){
		this.nurName = nurName ; 
	}
	public String getNurName(){
		return nurName ;
	}
	
	public void setNurPhone(String nurPhone){
		this.nurPhone = nurPhone ; 
	}
	public String getNurPhone(){
		return nurPhone ;
	}
	
	public void setNurEmail(String nurEmail){
		this.nurEmail = nurEmail ; 
	}
	public String getNurEmail(){
		return nurEmail ;
	}
	
	public void setNurPosition(String nurPosition){
		this.nurPosition = nurPosition ; 
	}
	public String getNurPosition(){
		return nurPosition ;
	}
	
	public void setMajorJob(String majorJob){
		this.majorJob = majorJob ; 
	}
	public String getMajorJob(){
		return majorJob ;
	}
	
	public void setNurId(int nurId){
		this.nurId = nurId ;
	}
	public int getNurId(){
		return nurId ;
	}
	public void calcNurGen(String ssn) {
		char ch = ssn.charAt(7);
		if (ch == '1' || ch == '3') {
			nurGen = "남자";
		} else if (ch == '2' || ch == '4') {
			nurGen = "여자";
		} else {
			nurGen = "외국인";
		}
	}
	public String getNurGen(){
		return nurGen ;
	}
	
   public int getAge(String ssn){
	    int year  = Integer.parseInt(ssn.substring(0,2)) + 1900; 
		int age = 2017- year; 
		return age;
	}

}