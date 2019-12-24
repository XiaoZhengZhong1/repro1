class WSXT{
	public static void main(String[] args) 
	{//题目1
		//1+2-3+4-5+6-7+8-9+10........100
		/*	int b = 1;	//题目思路分析,a不能从1开始.如果从1 开始.那么第一次循环,1%2不等于0,执行b-=a,b只能设0和1,结果计算1=1-1或者0=0-1.不符合题目要求,
		for (int a = 2;a <= 100  ;a++ )//所以a=2,,从2开始思路才是对的.b=1,又补回了1
		{if (a % 2 == 0){
		b += a;
		}else {
			b -= a;
		}
		}System.out.println(b );*/
		


//题目2
//一张纸的厚度是0.08mm,要对折多少次才能到珠穆拉玛的高度8884.13m
	/*	int b = 0;
	for (int a = 8;a <= 884813000 ;a *= 2){
		b++;
		
		
		
	}System.out.println(b);	
	//输出结果 27*/
		
	/*int b = 0;	
	int a = 8;	
		do{
			a *= 2;	//表示a=a*2
			b++;
		}
	while (a <= 884813000);	
	System.out.println(b);	*/	//输出结果 27
		
	

		}
}