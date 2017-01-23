package bank;

import java.util.Calendar;
import util.RandomGenerator;

public abstract class Account {
	public final static String BANK_NAME = "한빛뱅크";
	public final static String ACCOUNT_TYPE = "통장베이스";
	protected int money, accountNo ;
	protected String uid, accountType, createDate ;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String uid, String accountType, int money){  //6자리 랜덤숫자
		this.accountNo = RandomGenerator.getRandomNum(100000,999999); ; 
		this.createDate = Calendar.getInstance().get(Calendar.YEAR)+"년"
				        + Calendar.getInstance().get(Calendar.MONTH)+1+"월"
				        + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일" ;
		this.uid = uid;
		this.accountType= accountType;
		this.money = money;
	}
	
	/*public String today(){
		return Calendar.getInstance().get(Calendar.YEAR)+"년"
				+ Calendar.getInstance().get(Calendar.MONTH)+1+"월"
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일" ;
		
		String today = "";
		StringBuffer sb = new StringBuffer();
		Calendar now = Calendar.getInstance(); // class가 직접 호출하는 메소드! (class method) / memory를 점유하지 않음
		
		int yy = now.get(Calendar.YEAR);       
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);
		 
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일");
		today = sb.toString();
		
		return today;
	}*/
	
	public String getUid(){
		return uid;
	}
	
	public int getAccountNo(){
		return accountNo;
	}
	
	public String getAccountType(){
		return accountType;
	}
	
	public int getMoney(){
		return money;
	}
	
	public String getCreateDate(){
		return createDate;
	}
	public abstract void deposit(int money);
	public abstract void withdraw(int money);
	
	@Override
	public String toString() {
		return String.format("잔액은 %s원입니다.", getMoney());
	}
	
	/*//입금
	public void deposit(int money){
		this.money+=money;
	}
	//출금
	public void withdraw(int money){
		this.money=(this.money>money)?this.money-money:this.money;
	}*/
}