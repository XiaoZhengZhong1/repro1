class Interface接口 {
	public static void main(String[] args) {
		//father z = new father();	//错误: father是抽象的; 无法实例化
		father z = new son();	//通过多态实现接口实例化,父类引用指向子类对象.多态的前提.
			z.print();			//动态绑定,编译看左边,运行看右边,
	}
}
/*
1:接口的概述.
	a:从侠义的角度就是指java中的interface.
	b:从广义的角度就是指所有指定规则的,都是接口.就是一类公司指定规则.二类公司指定品牌.三类公司提供服务
2:接口关键字interface,格式:
	interface 接口名 {}
3:实现接口用implements表示,格式:
	class 类名 implements 接口名 {} 
4:接口不能实例化
	可以按照多态的方式,让子类实例化
5:接口的子类:
	可以是抽象类,但意义不大,
	可以是具体的类,但要重写接口类的所有方法.(推荐使用)
*/
interface father{
	public abstract void print();	//接口中的方法,必须都是抽象的

}
class son implements father{		//实现接口
	public void print(){			//重写方法,实现抽象类必须重写方法
		System.out.println("dayin");
	}			
}
/*
dayin
请按任意键继续. . .

*/