package hospital;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
        String ssn = "";
		/* 아래처럼 출력되도록 하세요
		 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 
		 * [간호사] 박신혜(여) 25세, park@test.com, 010-1234-5678 
		 * [환자] 홍길동(남) 15세, hong@test.com, 010-1234-5678
		 */
		switch (JOptionPane.showInputDialog("당신은 누구입니까? (1.의사 2.간호사 3.환자)")) {
		case "1":
			Doctors doc = new Doctors();
			doc.setDocName(JOptionPane.showInputDialog("이름"));
			ssn = JOptionPane.showInputDialog("주민번호(앞자리 7자리까지)");
			doc.calcDocGen(ssn);
			doc.setDocEmail(JOptionPane.showInputDialog("이메일"));
			doc.setDocPhone(JOptionPane.showInputDialog("휴대폰번호"));
			JOptionPane.showMessageDialog(null, "[의사]" + doc.getDocName() + doc.getDocGen() + doc.getAge(ssn) + "세" + doc.getDocEmail() + doc.getDocPhone());
			break;
		case "2":
			Nurses nur = new Nurses();
			nur.setNurName(JOptionPane.showInputDialog("이름"));
			ssn = JOptionPane.showInputDialog("주민번호(앞자리 7자리까지)");
			nur.calcNurGen(ssn);
			nur.setNurEmail(JOptionPane.showInputDialog("이메일"));
			nur.setNurPhone(JOptionPane.showInputDialog("이메일"));
			JOptionPane.showMessageDialog(null, "[간호사]" + nur.getNurName() + nur.getNurGen() + nur.getAge(ssn) + "세" + nur.getNurEmail() + nur.getNurPhone());
			break;
		case "3":
			Patients pat = new Patients();
			pat.setPatName(JOptionPane.showInputDialog("이름"));
			pat.setPatJumin(JOptionPane.showInputDialog("주민번호(앞자리 7자리까지)"));
			pat.calcPatGen();
			pat.setPatEmail(JOptionPane.showInputDialog("이메일"));
			pat.setPatPhone(JOptionPane.showInputDialog("휴대폰번호"));
			JOptionPane.showMessageDialog(null, "[환자]" + pat.getPatName() + pat.getPatGen() + pat.getAge() + "세" + pat.getPatEmail() + pat.getPatPhone());
			break;
		}
	}
}