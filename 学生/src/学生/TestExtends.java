package ѧ��;

public class TestExtends {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student=new Student("С��",18,"����");
	student.show();
	System.out.println();
	Undergraduate undergraduate=new Undergraduate("С��",20,"����","�������");
	undergraduate.show();
	System.out.println();
	Graduate graduate=new Graduate("С��",24,"�о���","�˹�����");
	graduate.show();
	System.out.println();
	}
}
class Student{//ѧ����
	String name;//����
	int age;//����
	String education;//ѧ��
	public Student(String name,int age,String education){//���췽��
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show(){
		System.out.println("����:"+name+"����:"+age+"ѧ��:"+education);
	}
}
class Undergraduate extends Student{//�������࣬��ѧ��������
	String specialty;//רҵ����������
	public Undergraduate(String name,int age,String education,String specialty){
		super(name,age,education);//�̳и��������
		this.specialty=specialty;
	}
	public void show(){
		super.show();//�̳и����show()����
		System.out.println("רҵ:"+specialty);
	}
}
class Graduate extends Student{//�о�����
	String direction;//�о�������������
	public Graduate(String name,int age,String education,String direction){
		super(name,age,education);//�̳и��������
		this.direction=direction;
	}
	public void show(){
		super.show();//�̳и����show()����
		System.out.println("�о�����:"+direction);
	}
}
