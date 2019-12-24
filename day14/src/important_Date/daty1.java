package important_Date;

import java.util.Date;

public class daty1 {

	public static void main(String[] args) {
/*##14.16_常见对象(Date类的概述和方法使用)(掌握)
* A:Date类的概述
	* 类 Date 表示特定的瞬间，精确到毫秒。 
* B:构造方法
	* public Date()
	* public Date(long date)
* C:成员方法
	* public long getTime()
	* public void setTime(long time)*/
	Date a = new Date();		//Date的空参构造方法,注意导包Date是util.Date;包下的-----没有参数代表的是,当前时间.
	System.out.println(a);
	
	Date a1 = new Date(0);//Date的有参构造方法,参数是0,是以诞生时间为对象,输出结果是1970 01 01 08:00:00--表示c语言诞生生日.
	a1.setTime(1000);	//表示设置毫秒值,改变时间对象,输出结果表示,离上面的0诞生时间过去了一秒Thu Jan 01 08:00:01 CST 1970
	System.out.println(a1);

	System.out.println(a.getTime());//通过时间方法,获取当前毫秒值.

	System.out.println(System.currentTimeMillis());//通过系统类方法,获取当前毫秒值.

	
	
	
	
	
	}

}
