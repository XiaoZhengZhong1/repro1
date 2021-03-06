/*
###10.08_面向对象(内部类概述和访问特点)(了解)
* A:内部类概述
* B:内部类访问特点
	* a:内部类可以直接访问外部类的成员，包括私有。
	* b:外部类要访问内部类的成员，必须创建对象。
	* 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
* C:案例演示
	* 内部类极其访问特点
*/

class leibulei {
	public static void main(String[] args) {
//外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		a.b c = new a().new b();//:外部类要访问内部类的成员，必须创建对象。
			c.method();
	}
}
class a{
	private int num = 10;	//内部类可以直接访问外部类的成员，包括私有。
		class b{	//b类在a类大括号里面,叫内部类,相当于b类是a类的成员,要访问类别成员就要new对象,因为是两个类,所以要new两个对象,
		public void method(){
			System.out.println("内部类" + "," + num);
		}
	}
}
/*
内部类,10
请按任意键继续. . .
*/