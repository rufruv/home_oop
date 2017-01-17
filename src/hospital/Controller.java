package hospital;

import java.util.Scanner;

public class Controller {
	String ssn;
	
	public String getGender(String ssn) {
		String result = " ";
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			result = "남자";
		} else if (ch == '2' || ch == '4') {
			result = "여자";
		} else {
			result = "외국인";
		}
		return result;
	}
	
	public int getAge(String ssn){
		int year  = Integer.parseInt(ssn.substring(0,2)) + 1900; 
		int age = 2017- year; 
		return age;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신은 누구입니까? (의사:1, 간호사:2, 환자:3)");
		/* 아래처럼 출력되도록 하세요
		 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 
		 * [간호사] 박신혜(여) 25세, park@test.com, 010-1234-5678 
		 * [환자] 홍길동(남) 15세, hong@test.com, 010-1234-5678
		 */
		int selector = s.nextInt();
		switch (selector) {
		case 1:
			Doctors doc = new Doctors();
			Controller con = new Controller();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			doc.docName = s.next();
			con.ssn= s.next();
			doc.docEmail = s.next();
			doc.docPhone = s.next();
			System.out.printf("[의사] %s(%s), %s, %s, %s ", 
					doc.docName, con.getGender(con.ssn), con.getAge(con.ssn), doc.docEmail, doc.docPhone );
			break;
		case 2:
			Nurses nur = new Nurses();
			Controller con2 = new Controller();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			nur.nurName = s.next();
			con2.ssn = s.next();
			nur.nurEmail = s.next();
			nur.nurPhone = s.next();
			System.out.printf("[간호사] %s(%s), %s, %s ", 
					nur.nurName, con2.getGender(con2.ssn), nur.nurEmail, nur.nurPhone );
			break;
		case 3:
			Patients pat = new Patients();
			Controller con3 = new Controller();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			pat.patName = s.next();
			con3.ssn = s.next();
			pat.patEmail = s.next();
			pat.patPhone = s.next();
			System.out.printf("[간호사] %s(%s), %s, %s ", 
					pat.patName, con3.getGender(con3.ssn), pat.patEmail, pat.patPhone );
			break;
		}
	}
}