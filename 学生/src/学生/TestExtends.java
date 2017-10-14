package 学生;

public class TestExtends {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student=new Student("小明",18,"高中");
	student.show();
	System.out.println();
	Undergraduate undergraduate=new Undergraduate("小红",20,"本科","软件工程");
	undergraduate.show();
	System.out.println();
	Graduate graduate=new Graduate("小白",24,"研究生","人工智能");
	graduate.show();
	System.out.println();
	}
}
class Student{//学生类
	String name;//姓名
	int age;//年龄
	String education;//学历
	public Student(String name,int age,String education){//构造方法
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show(){
		System.out.println("姓名:"+name+"年龄:"+age+"学历:"+education);
	}
}
class Undergraduate extends Student{//本科生类，有学生类派生
	String specialty;//专业，新增属性
	public Undergraduate(String name,int age,String education,String specialty){
		super(name,age,education);//继承父类的属性
		this.specialty=specialty;
	}
	public void show(){
		super.show();//继承父类的show()方法
		System.out.println("专业:"+specialty);
	}
}
class Graduate extends Student{//研究生类
	String direction;//研究方向，新增属性
	public Graduate(String name,int age,String education,String direction){
		super(name,age,education);//继承父类的属性
		this.direction=direction;
	}
	public void show(){
		super.show();//继承父类的show()方法
		System.out.println("研究方向:"+direction);
	}
}
