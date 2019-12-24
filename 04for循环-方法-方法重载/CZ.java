//重载定义:方法名相同(比如,下面add).参数列表不同(比喻这个方法求三个参数的和.另一个方法是求两个参数的和).和返回值无关.
//重载分类1参数个数不同.2.参数类型不同.意思就是多种方法的.参数个数不同,参数类型不同,都能在最上面class的第二个大括号里,分别调用方法和输出
/*
* B:方法重载：
	* 在同一个类中，方法名相同，参数列表不同。与返回值类型无关。
	
	* 参数列表不同：
		* A:参数个数不同
		* B:参数类型不同
		* C:参数的顺序不同(算重载,但是在开发中不用)
*/
//下面的三个方法在一个大括号里调用和输出,叫重载.不同的类型.参数,输出时要对号入座,

/*class CZ{
	public static void main(String[] args) 
	{	
		int x = add(10,20);
		System.out.println(x);
		
	double y = add(30.3,40.4,50.5);
		System.out.println(y);
		
	boolean z = add(60,70,80,90);				
		System.out.println(z);
	}

	public static int add(int a,int b) 
	{return a + b;
		
	}
	public static double add(double c,double d, double e) 
	{return c + d + e;
		
	}
	public static boolean add(int f,int g,int h,int i) 
	{return f + g == h + i;
		

	}*/
/*
输出结果如下:
30
121.2
false
*/



}
