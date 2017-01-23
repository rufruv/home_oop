package hospital;

public class Patients extends Member {
	private String patJob ;

	public void setPatJob(String patJob) {
		this.patJob = patJob;
	}
	public String getPatJob() {
		return patJob;
	}

	@Override
	public String toString() {
		return String.format("환자ID: %s\n"
							+ "간호사ID: %s\n"
							+ "의사ID: %s\n"
							+ "환자성명: %s\n"
							+ "환자성별: %s\n"
							+ "주민번호(800101-1): %s\n"
							+ "전화번호:%s\n"
							+ "주소: %s\n"
							+ "이메일: %s\n"
							+ "직업: %s\n", patUid, nurUid, docUid, name, calcGender(ssn), ssn, phone, addr, email, patJob);
	}
}