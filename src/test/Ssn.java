package test;

import java.util.Scanner;

public class Ssn {
	String ssn, name;

	public String getGender(String ssn) {
		String result = " ";
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "다시 입력하세요";
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

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ssn member = new Ssn();

		System.out.println("이름:");
		member.name = s.next();
		System.out.println("주민번호: ");
		member.ssn = s.next();

		String gender = member.getGender(member.ssn);
		System.out.println(member.name + "(" + member.getGender(member.ssn) + ")");
		// 한석규(남)
	}

}