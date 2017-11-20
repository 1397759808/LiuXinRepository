import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//将日期"yyyy/MM/dd"转化为"yyyy-MM-dd"格式
public class TestDate {
	private String str;
	public TestDate(String str){
		this.str=str;
	}
	public String change(){
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++){
			c[i]=str.charAt(i);
			if(c[i]=='/'){
				c[i]='-';
			}	
		}
		return new String(c);
	}
	public void changeStringToDate(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		String t=change();
		try {
			date=format.parse(t);//异常捕获
		} catch (ParseException e) {
			System.out.println("日期格式输入错误");
			e.printStackTrace();
		}
		System.out.println(date);
		System.out.println(format.format(date));
	}	
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入一个日期");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		TestDate testDate=new TestDate(str);
		testDate.changeStringToDate();		
	}
}
