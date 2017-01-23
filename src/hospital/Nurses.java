package hospital;

public class Nurses extends Member{
	private String nurPosition, majorJob ;
	
	
	public void setNurPosition(String nurPosition){
		this.nurPosition = nurPosition ; 
	}
	public String getNurPosition(){
		return nurPosition ;
	}
	
	public void setMajorJob(String majorJob){
		this.majorJob = majorJob ; 
	}
	public String getMajorJob(){
		return majorJob ;
	}

	@Override
	public String toString() {
		return String.format("간호사ID: %s\n"
							+"담당진료과목: %s\n"
							+"성명: %s\n"
							+"성별: %s\n"
							+"전화번호:%s\n"
							+"이메일: %s\n"
							+"직급: %s\n", nurUid, majorJob, name, calcGender(ssn), phone, email, nurPosition);
	}
}