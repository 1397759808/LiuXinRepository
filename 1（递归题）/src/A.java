import java.util.*;
public class A {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		n=s.nextInt();
		f(n);
	}
	public static void f(int n) 
	{
		System.out.println(n);//使符合的数字正序输出
		if (n<=5000)
		{
			 f(n*2);
		}
		System.out.println(n);//使符合的数字倒序输出
	}
}
