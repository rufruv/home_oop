package test;

public class Ssn {
	String ssn, name, gender;
	
	public void setSsn(String ssn){
		this.ssn = ssn ;
	}
	public String getSsn(){
		return ssn ; 
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void calcGender(){
		char ch = ssn.charAt(7);
		
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else {
			gender= "외국인";
		}
	}
	
	public String getGender() {
		return gender;
	}

	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ssn member = new Ssn();
		
		System.out.println("이름:");
		member.name = scanner.next();
		System.out.println("주민번호: ");
		member.ssn = scanner.next();
		
		String gender = member.getGender = (member.ssn);
		System.out.println(member.name + "(" + member.getGender(member.ssn)+")");
		//  한석규(남)
	}*/

}