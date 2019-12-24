package com.demo.string;

public class subject {

	public static void main(String[] args) {
/*//面试题?问结果是ture还是false 答案:两个都是ture
		String f = "abc";	//方法区常量池的特点是,赋值前先看常量池有没有对应的值,有就之间用,没有就创建,
		String f1 = "abc";	//因为上面已经创建了abc,所以给f1赋值时就直接用,是同一个地址
		System.out.println(f == f1);	//意思是f和f1的地址值相等吗?
		System.out.println(f.equals(f1));	//意思是f和f1的值相等吗?
*/
//面试题2:问下面创建了几次继承对象. 答:两次,常量池一次,堆内存一次.最后赋值的地址是堆内存的.
		//String g = new String("abc");
	
//面试题3:问结果?
	/*String h = new String("abc");	//h被赋值的地址是new的堆内存地址.
	String	h1 = "abc"; 			//h1被赋值的地址是方法区的常量区地址.
		System.out.println(h == h1);	//false
		System.out.println(h.equals(h1));	//true
*/		
//面试题4:问结果?
	/*	String b = "a" + "b" + "c";			//b = 1 + 2 + 3
		String b1 = "abc";					//b1 = 6
	System.out.println(b == b1);	//结果是true,因为java中有常量优化机制,就像上面演示一样,计算机会先算出b=6,再把b的地址给b1
	System.out.println(b.equals(b1));//结果是ture,因为分开和串联一起的结果是一样的
	*/
	
//面试题5:问结果?
	String a = "ab";
	String a2 = "abc";
	String a3 = a + "c";
	System.out.println(a2 == a3);	//结果是false因为a3=a+"c";加号与字符串相链会在堆内存中相加和转换成字符串地址,是堆内存地址.
	System.out.println(a2.equals(a3));//结果是true,因为最终结果都一样.
	
	
	}

}
