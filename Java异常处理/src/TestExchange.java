import java.util.Scanner;
/**
 * title:16����ת��Ϊ10������
 * @author
 * ���裺
 * 1.��ȡ�ַ����������벻��ȷ�׳��쳣���������
 * 2.���ַ���ת��Ϊ10������
 */
class Exchange{
	String s;//��ȡ16���Ƶ��������ַ�����ʽ
	private int y;//ת�����10������
	Exchange(String s){
		this.s=s;
	}
	int getY(){
		return y;
	}
	void setY(int y){
		this.y=y;
	}
	//��16����ת��Ϊ10����
	void Exchange16TO10(){
		int y=0;
		int i,k;
		for(i=0;i<s.length();i++){
			k=Change(s.charAt(i));//��ȡ�ַ���s�ĵ�i-1���ַ�
			/*
			 * Math.pow(base, exponent) 
			 * Math.pow() �������ػ�����base����ָ����exponent�����ݣ��� base^exponent��
			 */
			y+=k*Math.pow(16, s.length()-(i+1));//��16����ת��Ϊ10����
		}
		System.out.println(y);
		System.out.println("ת���ɹ�");
	}
	//���ַ���16������ת��Ϊ10���ƶ�Ӧ������
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
				throw new MyException();//�׳��쳣����
		}
		return x;
	}
}
//MyException��һ���Զ����쳣�࣬�̳���RuntimeExcep��
class MyException extends RuntimeException{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
	//�����벻��ȷʱ���׳��Զ����쳣
	public void printcount(){
		System.out.println("16���������벻��ȷ��");
	}
}
public class TestExchange{
	public static void main(String[] args){
		System.out.println("������һ��16��������");
		Scanner S=new Scanner(System.in);//����16������
		String s=S.next();//��������ĵ�ǰ�е�������Ϣ,�ÿո��������һ���ַ���
		Exchange E=new Exchange(s);
		try{
			E.Exchange16TO10();
		}
		catch(MyException e){
			e.printcount();
		}
	}
}
