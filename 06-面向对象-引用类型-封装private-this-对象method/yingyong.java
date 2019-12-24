/*(引用类型
###06.11_面向对象(方法的形式参数是类名的时候如何调用)(掌握)
* A:方法的参数是类名public void print(Student s){}//print(new Student());
	* 如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象
*///注意.测试类里面写方法,都要加静态,static,
class  yingyong {
	public static void main(String[] args) {
		jiaju c = new jiaju();
			print(c);//这里调用c,跟调用b,是一个意思
		
	}
	public static void print(jiaju b){//(jiaju b)就是引用类型,是下面类中的,类引用.引用类型必须先赋值才能使用,引用类型没有系统默认值,
		b.name = "x型椅";			  //所有需要new,其实就是一个类对象,新键的new对象,可以是b.因为不同方法里的值是不能访问的,上面new的地址返回给c,跟返回b
		b.colour = "红色";			 //道理是一样的,因为都是同一类中的对象.而且只有一个new存储,
	System.out.println(b.name + " " + b.colour);	
		b.zhedie();
	}
}
class jiaju {
	String name;
	String colour;
	public void zhedie() {
		System.out.println("这是一款可以折叠的椅子");
	}
/*输出结果:
x型椅 红色
这是一款可以折叠的椅子
请按任意键继续. . .
*/
}