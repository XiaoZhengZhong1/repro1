//�ü���¼��ͷ�������ӡ99�˷���
import java.util.Scanner;
class SmethodXT2 
{
	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
		System.out.println("������1-9֮�����������");
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
