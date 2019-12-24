/*###04.14_Java语言基础(控制跳转语句break语句)
* A:break的使用场景
	* 只能在switch和for等循环中使用 */

class TCXH 
{
	public static void main(String[] args) 
	{
		/*for (int a =1;a<=10 ;a++ )
		{
		if (a == 4)
		{break;		//跳出的意思,只要条件满足,就跳出循环.循环结束
		}
		System.out.println(a);	//输出结果 1 2 3 
		}*/
	
		

/*###04.15_Java语言基础(控制跳转语句continue语句)
* A:continue的使用场景
	* 只能在循环中 */

/*	for (int a =1;a<=10 ;a++ )
		{
		if (a == 4)
		{continue;	//意思是终止本次循环.继续下次循环
		}
		System.out.println(a);//输出结果1 2 3 5  6 7 8 9 10
		}*/



/*###04.16_Java语言基础(控制跳转语句标号)
* 标号:标记某个循环对其控制
* 标号组成规则:其实就是合法的标识符,意思就是只有不是数字开头.或者关键字.都可以,比喻a: b: c: outer(外部): inner(内部): 这些都可以;
*/
/*x: for (int a =1;a<=10 ;a++ ){
	System.out.println(a);
		}
	d: for (int b =1;b<=10 ;b++ ){
	System.out.println(b);
		break x;
		}	*/
	
	
/*	
#04.17_Java语言基础(控制调整语句练习)
* A:练习题
* 
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println(“Java基础班”);
		}
		
		我想在控制台输出2次:“Java基础班“
		我想在控制台输出7次:“Java基础班“
		我想在控制台输出13次:“Java基础班“	
*/	
	
	/*for(int x=1; x<=10; x++) {
			if(x%3==0) {
				break;//1 和 2 满足for的条件执行两次for的循环语句体到3摸鱼3等于0,条件满足,break终止循环
			}
			System.out.println("Java基础班");
		}*/
	
	
	/*for(int x=1; x<=10; x++) {
			if(x%3==0) {
				continue;	// 3 6 9 摸鱼3都等于0.终止3次继续执行7次
			}
			System.out.println("Java基础班");
		}*/
	
	
	/*for(int x=1; x<=10; x++) {
			if(x%3==0) {
			System.out.println("Java基础班");	//如果注释或删除此行,运作是10次for的循环语句.因为虽然3 6 9 满足if的条件,但是if后面没有循环语句
			}									//加上此行就有了循环语句.3次会输出3次循环语句,加上面的10次,一共13次
			System.out.println("Java基础班");
		}*/
	
/*
##04.18_Java语言基础(控制跳转语句return语句)
* A:return的作用
	* 返回
	* 其实它的作用不是结束循环的，而是结束方法的。
*/
	/*for(int x=1; x<=10; x++) {
			if(x%3==0) {
			return;//返回的意思.返回结束主方法的意思,整个主方法包括底下的输出语句都结束了,所以输出空白
			}									
			}
		System.out.println("Java基础班");
	//没有输出结果.*/
	}


}
