package hospital;

public class Doctors extends Member{
	private String docPosition, majorTreat ;
		
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

	public String getDocGen(String ssn) {
		String docGen = "";
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
		return docGen;
	}
	
	@Override
	public String toString() {
		return String.format("의사ID: %s\n"
							+"담당진료과목: %s\n"
							+"성명: %s\n"
							+"성별: %s\n"
							+"전화번호:%s\n"
							+"이메일: %s\n"
							+"직급: %s\n", docUid, majorTreat, name, calcGender(ssn), phone, email, docPosition);
	}
}