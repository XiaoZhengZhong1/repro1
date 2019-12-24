import java.util.Scanner;
class zxt2 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);	
		System.out.println("请输入一个整数");
	     int r = sc.nextInt();
		if (r == 0)
		{
		System.out.println("今天是晴天");
		}else if (r == 1)
		{
		System.out.println("今天是雨天");
		}else if (r == 3)
		{
		System.out.println("今天是阴天");
		}else if (r == 4)
		{
		System.out.println("今天下雪了");
		}else {System.out.println("对不起,您的输入有误,请重新输入");}
		
		
		
		}
}
