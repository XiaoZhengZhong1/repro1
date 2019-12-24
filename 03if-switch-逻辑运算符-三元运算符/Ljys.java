class Ljys{
	public static void main(String[] args) {
		//逻辑运算符的基本运算    逻辑运算的结果是boolean(布尔型)(不是true就是false)
		// & 逻辑 与 在数字7的上面.是 并且(and) 的意思 单独时念 与  参与运算时念 与上
		//int a = 10;
		//int b = 20;
		//int c = 30;
		//System.out.println(a < b & b < c);			//输出结果 true  (true & true)=true 因为a<b&b<c 就是a小于b 并且b小于c 是对的.所以结果是真真得真
		//System.out.println(a < b & b > c);			//输出结果 false (true & flase)=false 因为输出结果有一个是假的,整个结果当然也是假的
		//System.out.println(a > b & b < c);			//输出结果 false (false * true)=false 
		//System.out.println(a > b & b > c);			//输出结果 false (false & false)=false
		//结论,只有(true & true)结果是true,否则都是flase
		//叫有false则false
		
		// && 双与.在参与运算时结果和单与 & 一样.但是 && 双与有短路的效果,当左边是false时,右边不执行.  因为左边是false已经决定了结果也是false
			//int x = 4;												//如果左边是true,右边正常执行
			//int y = 3;
		//System.out.println(++x == 4 & ++y == 3);		    //输出结果 false 没毛病
		//System.out.println(y);							//输出结果 4 说明上行&单与执行了右边++的操作

		//System.out.println(++x == 5 && ++y == 3);			//输出结果 false 没毛病
		//System.out.println(y);					//输出结果 3 说明上行 && 双与没有执行右边++的操作	这就是短路的效果,当左边是false时,右边不执行				



		// | 逻辑 或 在enter回车键上面 是 或者(or)的意思 单独念 或 参与运算时念 或上
		//System.out.println(a < b | b < c);				//输出结果 true
		//System.out.println(a < b | b > c);				//输出结果 true
		//System.out.println(a > b | b < c);				//输出结果 true
		//System.out.println(a > b | b > c);				//输出结果 false
		
		// | 从字面上理解 或者,输出结果里只要有一个的真,就能满足或者,结果就是真true 输出结果全部都是false假,那结果肯定也是假的
	    //叫有true则true
		// || 双或  和 | 单或结果一样,但是||双或有短路效果.当左边是真true时 右边不执行操作.因为左边是true已经决定了结果也是true
															//如果左边是false,右边正常执行




	// ^逻辑 异或,在6上, 又或者吗的意思,本身有提问的意思.了解即可
	
	//System.out.println(a < b ^ b < c);		//输出结果 false  (true^true)=false
	//System.out.println(a < b ^ b > c);		//输出结果 true   (true^false)=true
	//System.out.println(a < b ^ b > c);		//输出结果 true   (true^false)=true
	//System.out.println(a > b ^ b > c);		//输出结果 false  (false^false)=false
	//结论 输出的括号的类容就是^两边的比较结果都一样,都对或者都是错的  结果都是false假  一个真一个假输出结果就是true真
	//叫相同则false 不同则true

	// !逻辑 非 就是字面上非的意思,非真就的假 非假就是真 非非真还是真 非非假还是假
	//System.out.println(! true);				//输出结果false
	//System.out.println(! false);			//输出结果true
	
	 
	 //变量交换
	 
	// int x = 5;
	//  int y = 10;
	//	int z;
	//	z = x;
		//y = z;
	//System.out.println(y);		//输出结果是 5 上题类容是两给整数值做变量交换,用第三方变量z来转换
	
	//x = x + y;						//5+10=15
	//y = x - y;						//15-10=5
	//System.out.println(y);			//输出结果 5  这题类容也是两给整数值做变量交换,没有用第三方变量,有弊端.如果两个数值太大.相加有可能超出int的取值范围
	
	/*int a = 5,b = 10;
	b = b - a;
	a = a + b;
	System.out.println("a=" + a + ",b=" + b);*/

	
	
	
	
	
	}
}
