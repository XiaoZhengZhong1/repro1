/*

###04.06_Java语言基础(循环结构while语句的格式和基本使用)
* A:循环结构while语句的格式：
* 		
		while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}
		
		完整格式：
		
		初始化语句;
	    while(判断条件语句) {
			 循环体语句;
			 控制条件语句;
		}
* B:执行流程：
	* a:执行初始化语句
	* b:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* c:执行循环体语句;
	* d:执行控制条件语句
	* e:回到B继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10*/
class sWhile {
	public static void main(String[] args){
	/*	int x = 1;	
	while (x <= 10){
		System.out.println("x=" + x);
			x++;	
		}*/
//求1-10的数据之和	
/*		int x = 1;	
	int y = 0;
	while (x <= 10){
	y += x;			//和y = x + y是一个意思;		
	x++;	//此行在最底下计算输出的从是 55,如果跟上行调换位置.输出结果是65		
	}
	System.out.println("y=" + y);*/

//统计水仙花的个数
	/*int y = 0;
	int x = 100;
	while (x <= 999){
	int ge = x % 10;
	int shi = x / 10 % 10;
	int bai = x / 10 / 10 % 10; 
	if (x == ge * ge * ge + shi * shi * shi + bai * bai * bai){
			y++;
	}
			x++;
	}
		System.out.println(y);	//输出结果y=4*/
	}
}