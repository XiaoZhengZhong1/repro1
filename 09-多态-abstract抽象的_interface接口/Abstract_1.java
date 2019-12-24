class Abstract_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
抽象类的成员特点:
	1:成员变量:既可以定义成变量,也可以定义成常量.
	2:有构造方法吗:有------用于子类访问父类的初始化值.
	3:成员方法既可以是抽象的,也可以是非抽象的.
抽象类的成员方法的特点:
	1:抽象方法,强制要求子类做的事情.只能重写.
	2:非抽象方法,子类继承的事情.提高代码复用性


*/
abstract class forest{
	int num = 10;	//变量
	final int a = 20;	//被final修饰过的变量,会变成常量,最终变量,不就是常量吗
	public forest(){}	//空参构造
	public void play(){}	//抽象类中的非抽象
	public abstract void live();	//抽象类中的抽象方法(注意;抽象方法没有大括号,直接分号结束)
}
class pine extends forest{			//此行报错,因为继承抽象类,要么把类改从抽象类.要么抽象抽象方法
	public void live(){}			//重写了抽象方法,运行通过
}