package com.stringBuffer;

public class next3 {

	public static void main(String[] args) {
/*##13.23_常见对象(Integer的面试题)
* A:Integer的面试题
* 
		看程序写结果*/
				
	Integer i1 = new Integer(97);
	Integer i2 = new Integer(97);
	System.out.println(i1 == i2);//fase,比较地址,两个new出来的对象地址肯定不一样
	System.out.println(i1.equals(i2));//ture,值一样
	System.out.println("-----------");

	Integer i3 = new Integer(197);
	Integer i4 = new Integer(197);
	System.out.println(i3 == i4);//同上
	System.out.println(i3.equals(i4));//同上
	System.out.println("-----------");

	Integer i5 = 97;
	Integer i6 = 97;
	System.out.println(i5 == i6);//ture 自动装箱一样的值肯定在一个地址里,
	System.out.println(i5.equals(i6));//同上
	System.out.println("-----------");

	Integer i7 = 197;
	Integer i8 = 197;
	System.out.println(i7 == i8);//fase 因为==号比较的地址是用byte字节型取值范围的,在-127到128直接,超出范围,要new对象
	System.out.println(i7.equals(i8));//同上


	
	
	
	
	}

}
