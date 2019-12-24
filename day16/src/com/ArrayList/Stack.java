package com.ArrayList;

import java.util.LinkedList;
@SuppressWarnings("unchecked")

public class Stack {
	@SuppressWarnings("rawtypes")
	private LinkedList L = new LinkedList();	//表示封装构造方法,只能在本类中所有.
//因为下面的进栈和出栈方法都是调用Linked中的方法所有要先导包和创建对象.方法被封装,但是方法可以通过导包进行使用.

//1:模拟进栈方法addLast();
	public void add(Object obj){	//由于没有确定的进栈参数,为了方便添加任何参数对象就直接用顶级父类当作参数.
		L.addLast(obj);				//表示可以添加任何顶级父类对象,也就是任意对象,因为所有的类都是Object的直接和间接的子类.
	}

//2:模拟出栈方法removeFirst();
	public Object out(){		//表示返回值类型是Object,因为上面集合中添加的也是Object,
		return L.removeFirst();	//表示出栈的方法就是从头开始删除
	}
//3:模拟栈结构是否为空
	public boolean isEmpty(){	//判断是否为空
		return L.isEmpty();		//表示返回的是集合是否为空,因为参入判断的还是集合.
	}
}
/*注意以上所有的方法都是模拟的,具体的进栈添加,和出栈删除,方法都是需要导包到具体的类中进行定义的.但是对象L被封装,只能在本类使用,可以重新
 * 在另一个类中用Stact类定义对象,调用类中方法.
 * 
 * */






