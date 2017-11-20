import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//������"yyyy/MM/dd"ת��Ϊ"yyyy-MM-dd"��ʽ
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
			date=format.parse(t);//�쳣����
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ�������");
			e.printStackTrace();
		}
		System.out.println(date);
		System.out.println(format.format(date));
	}	
	public static void main(String[] args) throws ParseException {
		System.out.println("������һ������");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		TestDate testDate=new TestDate(str);
		testDate.changeStringToDate();		
	}
}
