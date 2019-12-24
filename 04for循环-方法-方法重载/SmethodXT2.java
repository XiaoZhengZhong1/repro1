//用键盘录入和方法来打印99乘法表
import java.util.Scanner;
class SmethodXT2 
{
	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-9之间的任意整数");
			int a = sc.nextInt();
				print99(a);
	}
public static void print99(int a){
	for (int x = 1;x <= a ;x++ )
	{for (int y = 1;y <=x ;y++ )
	{System.out.print(y + "*" + x + "=" + (x*y) + "\t");
	}
	System.out.println();
	}

}





}
