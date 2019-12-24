/*

13:编写代码实现如下内容：if语句实现
考试成绩分等级。
	90~100	A等。
	80-89	B等。
	70-79	C等。
	60-69	D等。
	60以下	E等。
请根据给定成绩，输出对应的等级。



*/


import java.util.Scanner;
class zxt {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("请输入一个整数");
	int x = sc.nextInt();
	
	if (x >= 90 && x <=100) {
	System.out.println(x +",是A等");
	}else if (x >= 80 && x <= 89){
	System.out.println(x +",是B等");
	}else if (x >=70 &&  x <= 79) {
	System.out.println(x +",是c等");
	}else if (x >= 60 && x <= 69) {
	System.out.println(x +",是d等");
	}else if (x < 60 ) {
	System.out.println(x +",是e等");
	}else {System.out.println("对不起,您的输入有误,请重新输入");
	}
	
	}
}
