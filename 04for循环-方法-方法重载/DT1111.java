/*
//注意;以下向上转型和向下强转,使用子类独有的成员方法,在开发中很少用,了解即可.开发中都是直接继承和重写,再把父类方法当成方法参数mathod(father a)
//mathod(father a)表示父类对象 a 具备父类所有属性和行为,所有子类对象都可以调用执行,

*/
class DT1111 {
	public static void main(String[] args) {
		method(new cat());
		method(new dog());
	}
	public static void method(ainmal a){
		a.eat();
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