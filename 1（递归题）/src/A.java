import java.util.*;
public class A {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("������һ��������");
		n=s.nextInt();
		f(n);
	}
	public static void f(int n) 
	{
		System.out.println(n);//ʹ���ϵ������������
		if (n<=5000)
		{
			 f(n*2);
		}
		System.out.println(n);//ʹ���ϵ����ֵ������
	}
}
