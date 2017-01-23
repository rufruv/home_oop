package bank;

import java.util.Calendar;
import util.RandomGenerator;

public class WageAccount extends Account {
	public WageAccount(String uid, String accountType, int money){  
		accountNo = RandomGenerator.getRandomNum(100000,999999); 
		createDate = Calendar.getInstance().get(Calendar.YEAR)+"년"
				   + Calendar.getInstance().get(Calendar.MONTH)+1+"월"
				   + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일" ;
		super.uid = uid;
		super.accountType= accountType;
		super.money = money;
	}

	@Override
	public void deposit(int money) {
		this.money+=money;
	}

	@Override
	public void withdraw(int money) {
		this.money=(this.money>money)?this.money-money:this.money;
		
	}

}