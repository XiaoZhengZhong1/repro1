class Forxt2{	//习题1 请在数据台输出10-1和1-10
	public static void main(String[] args){
		/*for (int b = 10;b >= 1 ;b--){
	System.out.println("b=" + b);
	}
	System.out.println("-------------");
		for (int b = 1;b <= 10 ;b++){
			System.out.println("b=" + b);
		}*/
	
	/*习题2 请求出1-10直接的数据的和
	  题目分析:1-10之间的数据之和就是:1+2+3+4+5+6+7+8+9+10.1到10可以用for循环,循环语句的,初始表达值就设为y,求和,和可以设一个变量值x,再利用y的循环值来求和
	  因为是求和.所以要把y全部加起来再赋值给x,才能满足要求,所以是+y,用什么+y,用1+1的和3+4的和一直倒是10,和是x,输出的x是最终的总和,所以从1开始每次循环的值
	   的和都要加起来,所以x=x+y,循环第一次.x是从1加到10的,所以x=x+y的第一个循环值x应该是1,所以x的初始标识值应该是x=0
	*/
	/*int x = 0;
	for (int y = 1;y <= 10 ;y++ )
	{
	x = x + y;
	}
	System.out.println("x=" + x);//输出结果x=55, 注意如果此行输出代码上行的大括号里面,输出的结果会是依次十行输出. x=1一直到第十行x=55
	*/
	//习题2:求1-100之间的奇数数和
	/*int x = 0;				//方法1
	for (int y = 1;y <= 100 ;y += 2)//1到100按顺序基数加2刚好是下一个基数,从1直到99,+=和++一样在右边也是先赋值再自+=
	{
	x = x + y;
	}System.out.println("x=" + x);*/
	//方法2
	/*int x = 0;
	for (int y = 1;y <= 100 ;y++ )
	{
	
	if (y % 2 != 0) {
			x = x + y;
	}
	
	}
	System.out.println("x=" + x);*/
	//习题2,求1-100之间的偶数和
	//方法1
	/*int x = 0;
	for (int y = 0;y <=100 ;y += 2)
	{
	x = x + y;
	}
	System.out.println("x=" + x);*/
	//方法2
	/*int x = 0;
	for (int y = 1;y <= 100 ;y++ )
	{
	if (y % 2 == 0)
	{
	x = x + y; 
	}
	}
	
	System.out.println("x=" + x);*/
	
	
	
	
	
	}
}