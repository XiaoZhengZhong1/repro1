/*
abstract,抽象的,就是不能准确描述和修饰的,说不准的.
a:抽象类和抽象方法用abstract关键字修饰.
	1:abstract class ainmal   
	2:public abstract void eat();
b:有抽象类的不一定有抽象方法,有抽象方法的一定是抽象类或者接口.
c:抽象类不能实例化,那如何让抽象类实例化,来描述现时生活中的事物.
	答:按照多态的方式由具体的子类来实例化---------其实也是多态化的一种.抽象多态类.
d:抽象类的子类.
	1:要么是抽象类.
	2:要么重写抽象类中的所有方法.-------开发中用重写用得较多.
*/
class  Abstract{
	public static void main(String[] args) {
		//ainmal a = new ainmal();	//错误: ainmal是抽象的; 无法实例化
		ainmal a = new cat();		//父类引用指向子类对象,动态绑定,编译看左边,运行看右边.
				a.eat();			
	}
}
abstract class ainmal{           //抽象的动物类,--------动物本身就是抽象的,无法描述清楚的,因为动物有很多种类,无法形容动物就是怎样的-------可以用抽象
	public abstract void eat();	//抽象方法,没有大括号.直接分号结束;-------不知道动物具体怎么吃,有吃草的,吃鱼的,吃肉的等等--------可以用抽象
}
class cat extends ainmal{
	public void eat(){			//重写了抽象类的方法,因为父类是抽象类,所有子类要么是抽象类.要么重写抽象类的方法.否则就会报错
		System.out.println("猫吃鱼");
	}
}
/*
猫吃鱼
请按任意键继续. . .
*/