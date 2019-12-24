/*
多态中的成员访问特点之成员方法:编译看左边(父类)指father a,运行看右边(子类)指new son()  也叫绑定动态:意思就是强调方法重写,编译时看子类的成员方法父类有没有
有,证明是重写,可以输出子类成员方法,没有就会报错,
多态中静态成员方法.  静态跟类相关,用类名调用的,类名调用无法重写,子类有子类的类名.所以看左边类名是谁就输出谁;
总结:只有重写是(非静态的,就是动态的,动态绑定的),才是编译看左边,运行看右边.其它都是编译看左边运行看左边

*/
class  DT11{
	public static void main(String[] args) {
		father a = new son();		//编译看左边,运行看右边,所有输出的是右边new son()子对象中的 son
			a.print();
		son b = new son();
			b.print();	
		a.eat();
		b.eat();//静态各自代表各自的类,和对象.自然编译运行输出的也是各自的语句体
	}							 
}
class father{
	int NUM = 10;
	public void print(){
	System.out.println("father");
	}
	public static void eat(){
		System.out.println("吃饭喝酒");
	}
}
class son extends father{
	int NUM = 20;
	public void print(){
		System.out.println("son");
	} 
	public static void eat(){
		System.out.println("吃饭喝饮料");
	}
}
/*
son
son
吃饭喝酒
吃饭喝饮料
请按任意键继续. . .
*/