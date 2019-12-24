class next {
	public static void main(String[] args) {
		teather a = new teather("肖老师",31);
			System.out.println(a.getName() + "," + a.getAge());
					a.eat();
					a.function();
		student b = new student("xzz",18);
			System.out.println(b.getName() + "," + b.getAge());
				b.eat();
				b.function();
	}
}
/*
案例,老师学生
共性:姓名.年龄.吃饭
特性.老师讲课,
特性:学生学习.
分析:两个对象可以向上提升一个父类.人类
*/
abstract class person{
	private String name;
	private int age;
	public person(){}
	public person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public static void eat(){
		System.out.println("吃饭");
	}
	public abstract void function();

}
class teather extends person{
	public teather(){}
	public teather(String name,int age){
		super(name,age);
	}
	public void function(){
		System.out.println("老师讲课");
	}

}
class student extends person{
	public student(){}
	public student(String name,int age){
		super(name,age);
	}
	public void function(){
		System.out.println("学生学习");
	}	
}
/*
肖老师,31
老师讲课
xzz,18
学生学习
请按任意键继续. . .
*/
