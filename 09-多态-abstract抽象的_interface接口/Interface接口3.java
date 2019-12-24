class Interface接口3 {
	public static void main(String[] args) {
		
	}
}
/*
1:类与类,类与接口,接口与接口之间的关系?
	a:类与类,是继承关系,只能单继承,可多层继承(就是可以继承父类的,也可以继承父类上面的爷爷类的,但只能继承一个)
2:类与接口?
    B:实现关系,可以单实现,也可以多实现.并且还可以在继承一个类的同时,实现多个接口实现
	
3:接口与接口的关系?
	c:继承关系,可以单继承,也可以多继承.
4:总结,前面和后面一样叫继承,不一样叫实现
*/
interface a{
	public abstract void work();
}
interface b{
	public abstract void print();
}
interface c extends a,b{
	public abstract void eat();
}
class d extends Object implements a,b{	//类与接口?实现关系,可以单实现,也可以多实现,并且还可以在继承一个类的同时,实现多个接口实现.
	public void work(){
		System.out.println("work");
	}
	public void print(){
		System.out.println("print");
	}
}