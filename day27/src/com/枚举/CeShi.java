package com.枚举;

public class CeShi {

	public static void main(String[] args) {
	//测枚举类方式1:在枚举类中有参构造创建对象;	      
			  week MON = week.mon;
		      week TUE = week.tue;
		      week WED = week.wed;
				System.out.println(MON);
				System.out.println(TUE);
				System.out.println(WED);
	
   //测试枚举类方式2:在枚举中用有参构造创建对象.
		  	week2 MON2 = week2.mon2;
		  	System.out.println(MON2.getName());
	
  //测试枚举类方式3:在枚举中有抽象方法.
		  	week3 MON3 = week3.mon3;
		  			MON3.getName();
	}

}
