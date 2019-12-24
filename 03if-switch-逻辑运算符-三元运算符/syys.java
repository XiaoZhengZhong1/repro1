//运算类型有那些 算术运算(+ - * /)  取模运算(%) 自加自减运算(++ --)关系运算(== != > < >= <=) 逻辑运算(& && | || !)三元运算(? : )赋值运算(=)
class syys {
	public static void main(String[] args) {								
	//关系运算符  三元运算符 因为运算中有3个操作数 所以叫三元运算 运算规则 逻辑表达式的值 若为true 则输出(表达式1的值) 若为false 则输出(表达式2的值)
	//三元运算符号是   关系表达式 ? 表达式1 : 表达式2	符号是 ? :
				//3个数值之间的关系  true      false
		//int x = 5;
		//int y = 10;
		//int z;			//表达赋值的意思
		//z = x > y ? x : y;		//意思是x大于y吗 如果大于就把表达式1 x 的值赋值给z 否则就把表达式2 y的值赋值给z
		//System.out.println(z);*/	//输出结果 10
	
	
	//练习题 获取三给数中的最大值
	    // long x = 222;
	     // long y =333;
	     // long z = 444;
	    /* long b = x > y ? x : y;	//这是用一个假设值b来找出最大值
		      b = y > z ? y : z;
		      b = z > x ? z : x;
		  System.out.println(b);*/		//输出结果 444
		
		//long h = x > y ? x : y;
	//System.out.println(h);			//这是用两个假设值h和j来找出最大值
	//	long j = h > z ? h : z;	
	//System.out.println(j);		//输出结果 444
	
	
	//用三元运算符求两个数是否相等
	/*int a = 3;
	int b = 5;
	int c;
	c = (a == b) ? a : b;
	System.out.println(c);*/
	}
}
