package hospital;

public class Member {
	protected String name, ssn, email, addr, phone;
	protected int docUid, nurUid, patUid;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	} 
	public String getSsn(){
		return ssn;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setDocUid(int docUid){
		this.docUid = docUid;
	}
	public int getDocUid(){
		return docUid;
	}
	public void setNurUid(int nurUid){
		this.nurUid = nurUid;
	}
	public int getNurUid(){
		return nurUid;
	}
	public void setPatUid(int patUid){
		this.patUid = patUid;
	}
	public int getPatUid(){
		return patUid;
	}
	public String calcGender(String ssn) {
		String gender = "";
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			gender = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else {
			gender = "외국인";
		}
		return gender;
	}
	
}