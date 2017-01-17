package hospital;

public class Patients {
	String patName, patGen, patJumin, patEmail, patAddr, patPhone, patJob;
	int patID, nurId, docId ;
	
	public String getGender(String ssn) {
		String result = " ";
		char ch = patGen.charAt(7);
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
}