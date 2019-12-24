import java.util.Scanner;
class ifxt2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int z = sc.nextInt();
	if (z == 1)	{System.out.println("工资7000-9000");
	}
	
	
	if (z == 2) {System.out.println("工资9000--12000");					
	}
	
	
	if (z == 3) {System.out.println("工资12000--15000");
	}
	if (z > 3 | z <1){System.out.println("对不起您输入的数据有误");
	}
	}
}
//此练习题做了几个小时 原因1 多用了不必要的else  2  多了大括号 3 与& 和 或| 搞混淆了