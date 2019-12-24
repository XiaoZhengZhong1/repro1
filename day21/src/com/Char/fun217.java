package com.Char;

public class fun217 {

/*###21.16_File类(递归)=方法中调用方法本身.(在方法返回语句中return里面传入方法参数)
* 5的阶乘	=5*4*3*2*1
* 1:递归的弊端:不能调用过多次方法(就是阶乘的值不能太大.32位系统大概最大赋值是6000左右,64位的大概是几万),容易导致栈内存溢出.
* 2:不用知道循环次数.
* 3:构造方法中不能用递归,因为构造方法,是创建对象时自动调用,如果在构造方法中用循环调用方法,就是在不断创建对象.浪费.
* 4:递归不一定非要有方法值.如果只是输出打印,就无需返回值.
**/

	public static void main(String[] args) {
		System.out.println(fun(5));
	}
//demo(); 用fo循环来演示5的阶乘.也相当于是递归.
	public static void demo() {
		int a = 1;
	for (int i = 1; i < 6; i++) {
		a = a*i;
	}
	System.out.println(a);
	}
	
	
//递归演示,阶乘方法.
	public static int fun(int num){
		if(num == 1){	//表示如果num=1.
			return 1;	//表示返回1,结束方法.因为1的阶乘还是1.当下面else里面num-1=1时.此行返回1结束方法.
		}else{
			return num*fun(num - 1);//阶乘表达式,递归格式.如果num= 5. 5*fun(4),方法中调用方法,赋值4. num=4 4*fun(3)
		}
		
	}
	}





