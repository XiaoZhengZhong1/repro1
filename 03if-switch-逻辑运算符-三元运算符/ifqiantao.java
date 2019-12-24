//if 语句的嵌(qian)套使用   嵌套的意思就是在if语句中 在if和else的大括号里面再加if() {}else {}
//demo(演示)
//获取三个数的最大值
class ifqiantao {
	public static void main(String[] args) {
	/*int a = 89;	
	int b = 8;	
	int c = 20;	
	if (a > b) 
		{ if (a > c) {								//嵌套加进去的
		System.out.println(a + "是最大值");			//嵌套加进去的
	}else {System.out.println(c + "是最大值");		//嵌套加进去的
	}
	}else 
		{ if (b > c) {System.out.println(b + "是最大值");	//嵌套加进去的
	}else {System.out.println(c + "是最大值");}				//嵌套加进去的
	}*/
	
	int x = 1;
	int y = 1;

     if (x++ == 2 & ++y == 2) {  
	x = 7;
	}
	System.out.println("x=" + x + ",y=" + y);  
	}
}
