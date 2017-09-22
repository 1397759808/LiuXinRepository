import java.util.Scanner;
public class B {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	       System.out.println("请输入一个正整数："); 
	       int n=s.nextInt(); 
	       int i=1,j=0,k=0,flag=0,sign=0;
	       int[][] a=new int[n][n];//定义一个数组
	       for(i=1;i<=n*n;)//矩阵的绘制
	       {
	           for(k=0+flag;k<n-flag;k++)
	           {
	              a[j+sign][k]=i++;
	           }
	           for(j=1+flag;j<n-flag;j++)
	           {
	              a[j][k-1]=i++;
	           }
	           for(k=k-2;k>=0+flag;k--)
	           {
	              a[j-1][k]=i++;
	           }
	           for(j=j-2;j>=1+flag;j--)
	           {
	              a[j][k+1]=i++;
	           }
	           flag++;
	           sign=1;
	       }
	       for(i=0;i<n;i++)//输出矩阵
	       {
	           for(j=0;j<n;j++)
	              System.out.print(a[i][j]+"\t");
	           System.out.println();
	       }
	       
	}
}