package bank;

import test.Member;
import javax.swing.*;

public class Controller {
	
	public void start(){
		String tempSsn = "";
		Member mem = null;  // 터만 잡고 공간은 없다 ( initialize 아님)     
		Account account = null;
		
		while(true){
			/*String option = JOptionPane.showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지");*/
			/*int opt = Integer.parseInt(option);  // String을 int로 바꿔주는거 (""를 벗겨주는거)
			String opt2 = String.valueOf(opt);   // int를 String으로 바꿔주는거 (""를 씌어주는거)*/
			/* int flag = s.nextInt(); */
			switch(JOptionPane.showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지")){
			case "0": return;
			case "1": 
				mem = new Member(); // initialize (값이 입력될수 있는 구조물이 들어선 상태)
				mem.setUid(JOptionPane.showInputDialog("아이디"));
				mem.setName(JOptionPane.showInputDialog("이름"));
				while(true){
					/*String str2 = JOptionPane.showInputDialog("주민번호(앞자리7자리까지만)?");*/
					/*System.out.println("주민번호(앞자리7자리까지만)?");*/
					tempSsn = JOptionPane.showInputDialog("주민번호(앞자리7자리까지만)?");
					char ch = tempSsn.charAt(7);
					if(ch == 0 || ch == 7 || ch == 8 || ch == 9 ){
						System.out.println("다시 입력하셔요");
						JOptionPane.showMessageDialog(null, "다시 입력하세요");
					}else{
						break ;
					}
				}
				mem.setSsn(tempSsn);
				JOptionPane.showMessageDialog(null, mem.getName()+"님 회원등록이 되었습니다.");
				break;
			case "2": 
				String uid = "";
				int money = 0 ;
				String accountType = "저축예금";
				account = new WageAccount(uid, accountType, money);
				/* [한빛뱅크] 
				 * 계좌번호 : 123456
				 * 예금종류 : 저축예금 송상훈 
				 * 가입일 : 2016년 12월 14일
				 * 잔액 : ￦ 0
				 */
				while(true){
					uid = JOptionPane.showInputDialog("아이디?");
					if(mem.getUid().equals(uid)){
						break;
					}else{
						JOptionPane.showMessageDialog(null, "아이디를 다시 입력하시오");
					}
				}
				
				StringBuffer sb = new StringBuffer();
				sb.append("["+Account.BANK_NAME+"]\n");
				sb.append("계좌번호: " + account.getAccountNo()+"\n");
				sb.append("예금종류: " + account.getAccountType()+mem.getName()+"\n");
				sb.append("가입일: " + account.getCreateDate()+"\n");
				sb.append("잔액: " + account.getMoney()+"\n");
				/*System.out.println(sb.toString());*/
				JOptionPane.showMessageDialog(null, sb.toString());
				break;
			case "3":
				account.deposit(Integer.parseInt(JOptionPane.showInputDialog("얼마를 입금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case "4": 
				account.withdraw(Integer.parseInt(JOptionPane.showInputDialog("얼마를 출금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case "5": break;
			case "6": break;
			}
		}
	}
}