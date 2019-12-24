/*
A:案例演示
	* 使用继承前的学生和老师案例
	* 属性:姓名,年龄
	* 行为:吃饭
	* 老师有特有的方法:讲课
	* 学生有特有的方法:学习
*/

class one1 {
	public static void main(String[] args) {
		Teather q = new Teather("肖老师",31);
			System.out.println(q.getName() + ", " + q.getAge());	
			q.eat();
			q.teach();
		System.out.println("-------------------");
		student w = new student("xzz",31);
			System.out.println( w.getName() + ", " + w.getAge());	
				w.eat();
				w.study();
	
	}
}
class person{
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
	public void eat(){
		System.out.println(name + "吃饭");
	}
}
class Teather extends person{
	public Teather(){}
	public Teather(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println(super.getName() + "吃饭");
	}
	public void teach(){
		System.out.println(super.getName() + "讲课");
	}
}
class student extends person{
	public student(){}
	public student(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println(super.getName() + "吃饭");
	}
	public void study(){
		System.out.println(super.getName() + "学习");
	}

}
/*
肖老师, 31
肖老师吃饭
肖老师讲课
-------------------
xzz, 31
xzz吃饭
xzz学习
请按任意键继续. . .
*/