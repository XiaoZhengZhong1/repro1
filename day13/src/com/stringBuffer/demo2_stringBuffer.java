package com.stringBuffer;

public class demo2_stringBuffer {

	public static void main(String[] args) {
/*##13.03_常见对象(StringBuffer的添加功能)
* A:StringBuffer的添加功能
* public StringBuffer append(String str):
  可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 public StringBuffer insert(int offset,String str):
 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身*/

	StringBuffer a = new StringBuffer();
	System.out.println(a);//输出结果为空.说明重写了toString方法,不然会输出会输出 地址值
	System.out.println(a.toString());//输出结果为空
	//可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身:append(String str):
	//上面新键的对象 a 是一个空参构造,下面分别在里面添加,int Boolean string char 类型的值,下面4个对象指向一个引用.
	//StringBuffer是字符串缓区,当new的时候是在堆内存中创建了一个对象,空间底层是一个长度为16的字符数组,当调用添加方法时,不会再创建
	//对象,在不断的向缓冲区添加字符
	StringBuffer a1 = a.append(100);
	StringBuffer a2 = a.append(true);
	StringBuffer a3 = a.append("xzz");
	StringBuffer a4 = a.append('d');
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	//输出结果显示输出上面任意一个,结果都是 100truexzzd 证明4个引用指向一个对象,并把所有添加元素的保存在一个new空间里.
	
	//public StringBuffer insert(int offset,String str):
	//在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
	StringBuffer b = new StringBuffer("helloword");
		 b.insert(3, "xzz");//表示在b对象的,第3个索引位置添加xzz
		 System.out.println(b);	//输出结果:helxzzloword
	
	
//append是在头或者尾进行添加.     insert是在指定位置进行插入.	
	
	}

}
