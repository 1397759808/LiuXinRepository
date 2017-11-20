import java.util.Scanner;
/**
 * title:16进制转化为10进制数
 * @author
 * 步骤：
 * 1.获取字符串，如输入不正确抛出异常，否则继续
 * 2.将字符串转化为10进制数
 */
class Exchange{
	String s;//获取16进制的数，以字符串形式
	private int y;//转化后的10进制数
	Exchange(String s){
		this.s=s;
	}
	int getY(){
		return y;
	}
	void setY(int y){
		this.y=y;
	}
	//将16进制转化为10进制
	void Exchange16TO10(){
		int y=0;
		int i,k;
		for(i=0;i<s.length();i++){
			k=Change(s.charAt(i));//获取字符串s的第i-1个字符
			/*
			 * Math.pow(base, exponent) 
			 * Math.pow() 函数返回基数（base）的指数（exponent）次幂，即 base^exponent。
			 */
			y+=k*Math.pow(16, s.length()-(i+1));//将16进制转化为10进制
		}
		System.out.println(y);
		System.out.println("转换成功");
	}
	//将字符串16进制数转化为10进制对应的数字
	int Change(char h){
		int x;
		switch(h){
		case'0':
			x=0;
			break;
		case'1':
			x=1;
			break;
		case'2':
			x=2;
			break;
		case'3':
			x=3;
			break;
		case'4':
			x=4;
			break;
		case'5':
			x=5;
			break;
		case'6':
			x=6;
			break;
		case'7':
			x=7;
			break;
		case'8':
			x=8;
			break;
		case'9':
			x=9;
			break;
		case'a':
			x=10;
			break;
		case'b':
			x=11;
			break;
		case'c':
			x=12;
			break;
		case'd':
			x=13;
			break;
		case'e':
			x=14;
			break;
		case'f':
			x=15;
			default:
				throw new MyException();//抛出异常对象
		}
		return x;
	}
}
//MyException是一个自定义异常类，继承了RuntimeExcep。
class MyException extends RuntimeException{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
	//当输入不正确时，抛出自定义异常
	public void printcount(){
		System.out.println("16进制数输入不正确！");
	}
}
public class TestExchange{
	public static void main(String[] args){
		System.out.println("请输入一个16进制数：");
		Scanner S=new Scanner(System.in);//输入16进制数
		String s=S.next();//获得完整的当前行的输入信息,用空格隔开的下一个字符串
		Exchange E=new Exchange(s);
		try{
			E.Exchange16TO10();
		}
		catch(MyException e){
			e.printcount();
		}
	}
}
