package com.System1;

public class system2 {

	public static void main(String[] args) {
/*##14.13_常见对象(System类的概述和方法使用)
* A:System类的概述
	* System 类包含一些有用的类字段和方法。它不能被实例化。 
* B:成员方法
	1* public static void gc()
	2* public static void exit(int status)
	3* public static long currentTimeMillis()
	4* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
* C:案例演示
	* System类的成员方法使用*/
//	System.gc();//1-------表示运行垃圾回收器.
//	System.exit(0);//2-----表示退出java虚拟机,0是正常退出,0以外的是异常退出,退出后将不再有运行
//3:currentTimeMillis意思是获取当前时间的毫秒值,1秒=1000毫秒.当前时间与协调世界时 1970 年 1 月 1 日午夜之间的时间差,以毫秒为单位
	long a = System.currentTimeMillis();//3定义当前时间.   因为Sysem类不能被实例化,只能用类名调用方法.因为是静态方法.
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
	long a1 = System.currentTimeMillis();	//定义结束时间.
	System.out.println(a1-a);		//计算时间差,计算上面for循环的时间
	
//4:arraycopy复制数组的意思
	int[] b = {11,22,33,44,55,66,77};
	int[] b1 = new int[10];	//表示new一个10个长度的空数组,int类型的数组系统默认值是0,先遍历打印下空数组.
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + ", ");//0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		}
	System.out.println();
	System.arraycopy(b, 0, b1, 0, b.length);//表示把b数组从0索引开始,复制到b1数组中,从0索引粘贴,复制长度是b数组的长度.
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + ", ");	//打印下复制后的b1数组.11, 22, 33, 44, 55, 66, 77, 0, 0, 0, 
		}
	}

}
