package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		int i = 0 ;
		String temp="";                      // local variable
		System.out.println("어떤 작업을 원하세요? 1.BMI측정 2.성별입력 3.로또 4.성적표 0.종료");
		int selector = s.nextInt();
		switch (selector) {
		case 0:
			return;
		case 1:
			Bmi[] patients = new Bmi[3];
			for (i = 0; i < patients.length; i++) {
				System.out.println("이름, 나이, 몸무게, 키?");
				patients[i] = new Bmi(); // initialize(초기화)
				// String name = scanner.next();
				patients[i].setName(s.next());
				patients[i].setAge(s.nextInt());
				patients[i].setWeight(s.nextDouble());
				patients[i].setHeight(s.nextDouble() / 100);
				patients[i].calcBmi();
				System.out.printf("%s의 BMI 결과는 %s\n", patients[i].getName(), patients[i].getResult());
			}
			break;
		case 2:
			Ssn member = new Ssn();
			System.out.println("이름: ");
			member.setName(s.next());
			while (true) {                     // validation 유효성 체크
				System.out.println("주민번호: ");
				temp = s.next();
				char ch = temp.charAt(7);
				if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
					System.out.println("다시 입력하세요");
				} else {
					break;
				}
			}
			member.setSsn(temp);
			member.calcGender();
			System.out.printf("%s(%s)", member.getName(), member.getGender());
			// 한석규(남)
		case 3:
			// lotto
			break;
		case 4:
			ReportCard card = new ReportCard() ;
			System.out.print("Name:");
			card.setName(s.next());
			int score=0, total=0; 
			for(i=0; i<6; i++){
				System.out.println("Score: ");
				System.out.println("If you want to stop, Type -1");
				System.out.println("If the number of Subject is 6, Auto quit!");
				score = s.nextInt();
				total += score;
			}
			card.setTotal(total);
			card.setAverage(total/6);
			card.calcGrade();
			
			System.out.printf("%s: %d\n","Name", card.getName());
			System.out.printf("%s: %d\n", "Total", card.getTotal());
			System.out.printf("%s: %d\n", "Average:", card.getAverage());
			System.out.printf("%s: %d", "Grade:", card.getGrade());
			break;
			}
	}
}