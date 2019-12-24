

/*
1:父类引用指向子类对象,就是向上转型,把子类向上转型成父类.比如father a = new son(); son g = (son)a 这就是向下转型,
	把父类对象,前面加上子类类名,强制转换成右边的子类.转换后能编译运行子类中有父类中没有的成员方法.
*/

class DT111 {
	public static void main(String[] args) {
	father a = new son();//父类引用指向子类对象,就是向上转型,把子类向上转型成父类.
		//	a.play();//输出报错,因为编译非静态方法,就是动态绑定,编译看左边,运行看右边,但是左边父类中没有子类中的方法,没有被重写.所以报错
	
	son g = (son)a;//把父类对象,前面加上子类类名,强制转换成右边的子类.转换后能编译运行子类中有父类中没有的成员方法.
		g.play();
	}
}
class father{
	public void drink(){
		System.out.println("喝白酒");
	}
}
class son extends father{
	public void play(){
		System.out.println("玩电脑");
	}

}
*/