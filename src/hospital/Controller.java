package hospital;

import javax.swing.JOptionPane;

public class Controller {
	public final static String EXE_OPTION = "0.EXIT\n" + "1.REG-DOCTOR\n" + "2.REG-NURSE\n" + "3.REG-PATIENT\n" + "4.CHEK-BMI\n";

	public final static String DOC_SPEC = "INPUT AS 의사ID, 담당진료과목, 성명, 주민번호, 전화번호, 이메일, 직급";
	public final static String NUR_SPEC = "INPUT AS 간호사ID, 담당진료과목, 성명, 주민번호, 전화번호, 이메일, 직급";
	public final static String PAT_SPEC = "INPUT AS 환자ID, 간호사ID, 의사ID, 성명, 주민번호, 전화번호, 주소, 이메일, 직업";
	public final static String BMI_SPEC = "INPUT AS 몸무게, 키";

	public void startHospital() {
		while (true) {
			switch (JOptionPane.showInputDialog(EXE_OPTION)){
			case "0": return;
			case "1":
				Doctors doc = new Doctors();
				String docInfo = JOptionPane.showInputDialog(DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setDocUid(Integer.parseInt(docInfoArr[0]));
				doc.setMajorTreat(docInfoArr[1]);
				doc.setName(docInfoArr[2]);
				doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.toString());
				break;
			case "2":
				Nurses nur = new Nurses();
				String nurInfo = JOptionPane.showInputDialog(NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setNurUid(Integer.parseInt(nurInfoArr[0]));
				nur.setMajorJob(nurInfoArr[1]);
				nur.setName(nurInfoArr[2]);
				nur.setSsn(nurInfoArr[3]);
				nur.setPhone(nurInfoArr[4]);
				nur.setEmail(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.toString());
				break;
			case "3":
				Patients pat = new Patients();
				String patInfo = JOptionPane.showInputDialog(PAT_SPEC);
				String[] patInfoArr = patInfo.split(",");
				pat.setPatUid(Integer.parseInt(patInfoArr[0]));
				pat.setNurUid(Integer.parseInt(patInfoArr[1]));
				pat.setDocUid(Integer.parseInt(patInfoArr[2]));
				pat.setName(patInfoArr[3]);
				pat.setSsn(patInfoArr[4]);
				pat.setAddr(patInfoArr[5]);
				pat.setPhone(patInfoArr[6]);
				pat.setEmail(patInfoArr[7]);
				pat.setPatJob(patInfoArr[8]);
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4":
				Bmi bmi = new Treatment();
				String bmiInfo = JOptionPane.showInputDialog(BMI_SPEC);
				String[] bmiInfoArr = bmiInfo.split(",");
				bmi.setWeight(Double.parseDouble(bmiInfoArr[0]));
				bmi.setHeight(Double.parseDouble(bmiInfoArr[1]));
				JOptionPane.showMessageDialog(null, bmi.toString());
				break;
			}

		}
	}

}