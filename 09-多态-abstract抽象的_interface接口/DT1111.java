/*
多态的好处:1:提高了代码的维护性(继承保证) 2:提高了代码的扩展性(多态保证) 3:可以当作参数,接收所有子类对象method(ainmal z)参数方法,父类引用指向子类对象的意义
多态的坏处:不能使用子类特有的属性和行为
aimal z = new cat()  这行代码开发中一般是不会这么写的,都是像下面演示一样method(ainmal z)当作参数
*/
class  DT1111{
	public static void main(String[] args) {
			method(new cat());//此行代码和aimal z = new cat();是一个意思,就是父类引用指向子类对象.new cat()这里是匿名对象,父类引用也当作方法参数,接收对象
			method(new dog());//
	}
	public static void method(ainmal z){//父类对象当作方法参数的时候用多态最好,扩展性强
		z.eat();
	}

}
class ainmal{
	public void eat(){
		System.out.println("动物吃饭");
	}
}
class cat extends ainmal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
class dog extends ainmal{
	public void eat(){
		System.out.println("狗吃肉");
	}
}
/*
猫吃鱼
狗吃肉
请按任意键继续. . .
*/