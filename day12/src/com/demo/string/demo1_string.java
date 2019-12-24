package com.demo.string;

public class demo1_string {
/*string类被final修饰,不能被继承.
	a:字符串字面值"abc",可以看成一个字符串对象.
	b:字符串是常量,一旦赋值,就不能被改变.

*/
	public static void main(String[] args) {
		String a = "abc";	//"abc",可以是字符串对象.不用new,字符串对象可以直接用""表示,
			a = "def";		//def赋值给a,原来的对象abc就变成了垃圾,def改变的是值,地址值没变.
	System.out.println(a);
	System.out.println(a.toString());	//因为此行和上行运行结果一样,所以上面string重写了tostring方法,返回的是该对象本身
	//如果字符串输出是S@5876之类是指.说明没有重写tostring方法.如果字符串输出结果该对象本身.说明重写了tostring方法
	}

}
