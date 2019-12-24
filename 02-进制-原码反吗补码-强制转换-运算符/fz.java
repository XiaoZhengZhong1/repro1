class fz {
	public static void main(String[] args) {
	//赋值运算符的基本用法	
	//	= 等于号
	//	int a = 3;								//输出结果 3 没毛病
	//	int 3 = a;								//输出错误 不是语句  3是常量 3就是3,右边a不能给常量3赋值  就是把左右两边相加的结果,赋值给左边. 
	
	// += 加等于   就是把左右两边相加的结果,赋值给左边. 
	//int a = 3;	
	 //a += 4;					//输出a 结果是7   += 相当于做了一个加法的运算,再做一个等于赋值,先做加法运算 a+4=7 再做一个等于的赋值.a=7 
								// 就是把左右两边相加的结果,赋值给左边.     -=   *=   /=      道理一样.
	//System.out.println(a);	
		
		

		//面试题
		//short s = 1;// s = s + 1;		// s 输出结果错误.因为整数 1 系统默认是int类型.int+short结果还是int类型.所以出错.要加强制转换符比喻 s = (short) (s + 1)
		//s += 1;							// s 输出结果 2  因为 += 符号和之前的 ++ 符号一样系统会自动在前面加强制转换符
		//System.out.println(s);
	

		//关系运算符 ==  !=  >  >=  <  <=   都叫比较符;分别是 等于  不等于 大于 大于等于  小于  小于等于  关系运算符的结果是boolean(布尔型)
		//布尔型的结果只有两个 true(真.对的) 和 false(假.错的)
		//System.out.println(4 == 3);          //输出结果 false 
		//System.out.println(4 != 3);			 //输出结果 ture
		//System.out.println(4 > 3);			 //输出结果 ture
		//System.out.println(4 >= 3);			 //输出结果 true
		//System.out.println(4 < 3);			 //输出结果 false
		//System.out.println(4 <= 3);			 //输出结果 false
	
	}
}
