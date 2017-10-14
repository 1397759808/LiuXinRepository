package 银行定期存款;

public class deposit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount("12345677890","ZhangSan",5000);
		//账号：1234567890；姓名：ZhangSan；定存：5000；
		saver.CheckBalance();//查询余额     
		saver.deposit(2000);//存入2000元
		saver.Rate(0.023);//存款年利率为2.3%
		saver.Time(1);//存款两年
		System.out.println("年利息为："+saver.Interest());
	}
}
class DepositAccount{
	private String account;//账户
	private String name;//储户姓名
	private double balance;//存款余额
	static double  rate;//年利率 annual interest rate
	private int time;//存款时间
	public DepositAccount(String account,String name,double balance){//开户	
		this.account =account;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double money){//存款
		System.out.println("现在存入："+money);
		balance+=money;
		System.out.println("存款成功，余额为："+balance);
	}
	public void CheckBalance(){//查询余额
		System.out.println("余额为："+balance);
	}
	public double Interest(){//计算利息
		return balance*rate*time;	
	}
	public void Rate(double rate){//设置年利率
		this.rate=rate;
	}
	public void Time(int time){//设置存款时间
		 this.time=time;
	}
}