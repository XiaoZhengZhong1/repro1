/*

###04.08_Java语言基础(循环结构do...while语句的格式和基本使用)
* A:循环结构do...while语句的格式：
* 
		
		
		完整格式；
		初始化语句;
		do {
			循环体语句;
			控制条件语句; 
		}while(判断条件语句);
* B:执行流程：
	* a:执行初始化语句
	* b:执行循环体语句;
	* c:执行控制条件语句
	* d:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* e:回到b继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10
*/
class Sdowhile {
	public static void main(String[] args) {
		 int x = 1;
			do{
	System.out.println("x=" + x);	
		x++;
		}
		while (x <= 10);
//问题:do while和while和for的区别		
//答:do while是先执行语句体循环再做判断.不管条件满不满足,都会执行一次,初始值的语句体循环.而while和for则是先做判断再,只有条件满足了,才会执行语句体循环.		
		
		
	}
}
