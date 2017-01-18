package hospital;

public class Patients {
	String patName, patGen, patJumin, patEmail, patAddr, patPhone, patJob;
	int patId, nurId, docId ;
	
	public void setPatName(String patName){
		this.patName = patName;
	}
	public String getPatName(){
		return patName ;
	}
	
	public void setPatJumin(String patJumin){
		this.patJumin = patJumin;
	}
	public String getPatJumin(){
		return patJumin ;
	}
	
	public void setPatEmail(String patEmail){
		this.patEmail = patEmail;
	}
	public String getPatEmail(){
		return patEmail ;
	}
	
	public void setPatAddr(String patAddr){
		this.patAddr = patAddr ;
	}
	public String getPatAddr(){
		return patAddr ;
	}
	
	public void setPatPhone(String patPhone){
		this.patPhone = patPhone ;
	}
	public String getPatPhone(){
		return patPhone ;
	}
	
	public void setPatJob(String patJob){
		this.patJob = patJob ;
	}
	public String getPatJob(){
		return patJob ;
	}
	
	public void setPatId(int patId){
		this.patId = patId ;
	}
	public int getPatId(){
		return patId ;
	}
		
	public void setDocId(int docId){
		this.docId = docId ;
	}
	public int getDocId(){
		return docId ;
	}
	
	public void setNurId(int nurId){
		this.nurId = nurId ;
	}
	public int getNurId(){
		return nurId ;
	}
	
	public void calcPatGen() {
		char ch = patJumin.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			patGen = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			patGen = "남자";
		} else if (ch == '2' || ch == '4') {
			patGen = "여자";
		} else {
			patGen = "외국인";
		}
	}
	public String getPatGen(){
		return patGen ;
	}
	
	public int getAge(){
		int year  = Integer.parseInt(patJumin.substring(0,2)) + 1900; 
		int age = 2017- year; 
		return age;
	}
}