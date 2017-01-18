package hospital;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String ssn = "";
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
			System.out.println("'이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			doc.setDocName(s.next());
			ssn = s.next();
			doc.calcDocGen(ssn);
			doc.setDocEmail(s.next());
			doc.setDocPhone(s.next());
			System.out.printf("[의사] %s(%s) %d세, %s, %s ", 
					doc.getDocName(), doc.getDocGen(), doc.getAge(ssn), doc.getDocEmail(), doc.getDocPhone());
			break;
		case 2:
			Nurses nur = new Nurses();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			nur.setNurName(s.next());
			ssn = s.next();
			nur.calcNurGen(ssn);
			nur.setNurEmail(s.next());
			nur.setNurPhone(s.next());
			System.out.printf("[간호사] %s(%s) %d세, %s, %s ", 
					nur.getNurName(), nur.getNurGen(), nur.getAge(ssn), nur.getNurEmail(), nur.getNurPhone());
			break;
		case 3:
			Patients pat = new Patients();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			pat.setPatName(s.next());
			pat.setPatJumin(s.next());
			pat.calcPatGen();
			pat.setPatEmail(s.next());
			pat.setPatPhone(s.next());
			System.out.printf("[간호사] %s(%s) %d세, %s, %s ", 
					pat.getPatName(), pat.getPatGen(), pat.getAge(), pat.getPatEmail(), pat.getPatPhone());
			break;
		}
	}
}