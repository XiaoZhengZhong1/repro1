/*
###08.19_面向对象(final关键字修饰类,方法以及变量的特点)(掌握)
* A:final概述
* B:final修饰特点
	* 修饰类，类不能被继承
	* 修饰变量，变量就变成了常量，只能被赋值一次
	* 修饰方法，方法不能被重写
* C:案例演示
	* final修饰特点
*/


//final就是最终的意思,用final修饰类,就表示该类就是最终的类,无法被继承,用final修饰变量，变量就变成了常量，只能被赋值一次,final修饰方法，方法不能被重写
final class father{								//修饰类，类不能被继承
	public static void main(String[] args) {
		final int NUM = 10;							//常量如果是一个单词,所有字母都必须大写,如果是多个单词,每个单词都大写,中间用_下划线隔开
	//public static final double PI = 3.14;
	
		//final修饰成员变量,一般都会配合public static final 一起使用,因为用final修饰后已经成变量了.是最终值了,修改不了	
											//那么将可以用public static 公共的,共享的,像主方法一样,扩大它的访问权限.
	

//class son extends father{					//错误: 无法从最终father进行继承  因为类已经被final修饰成为最终类了
//}
/*
##08.20_面向对象(final关键字修饰局部变量)(掌握)
* A:案例演示
	* 方法内部或者方法声明上都演示一下(了解)

	* 基本类型，是值不能被改变
	* 引用类型，是地址值不能被改变,对象中的属性可以改变
*/
	final Bed j = new Bed("红木床",9999);
		//j = new Bed("白木床",1999);		//错误: 无法为最终变量j分配值 ,因为引用类型，是地址值不能被改变
		j.setName("白木床");				
		j.setPrice(1999);					//设置后输出结果:白木床, 1999 , 引用类型，是地址值不能被改变,对象中的属性可以改变
		System.out.println(j.getName() + ", " + j.getPrice());

	}
}
class Bed{
	private String name; 
	private int price;
	public Bed(){}
	public Bed(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	
}