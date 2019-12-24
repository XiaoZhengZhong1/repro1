
/*class ForFor 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <=3 ;a++ )
			{System.out.println("0");
			for (int b = 1;b <= 5;b++ ){		/*此行就是嵌套进去的.在for的大括号里面再加for,叫外循环控制内循环.就是嵌套进去的整个for语句都是一个循环体,
				System.out.println("1");		就是外行for循环一次,内循环for就会执行完整个循环过程,再又回到外循环for外循环执行第二次外循环.内循环再次执行完
		}										整个循环过程.又回到外循环......直到外循环结束每次都会执行完整个内循环,
		}										输出结果是:011111011111011111011111(输出结果是竖起来的)
		
	}*/		
//}
/*class ForFor 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <=3 ;a++ )	
			{System.out.print("0");		//println去掉后面ln.意思是换行
			for (int b = 1;b <= 5;b++ ){
				System.out.print("1");	//输出结果是011111011111011111011111,但是横着的.
		}
		}
		
	}
}*/
/*class ForFor 
{
	public static void main(String[] args) 
	{	
		for (int a = 1;a <=3 ;a++ )	
			{
			for (int b = 1;b <= 5;b++ ){
				System.out.print("1");}	//print表示横着打印,不换行.
		System.out.println();	//起到换行,注意一定要写在内循环for的大括号外面.表示内循环结束后再换行.因为括号里是空白的,光标会跳到下行
		}
				   11111
	}	//输出结果:11111
				   11111
}	*/			   
