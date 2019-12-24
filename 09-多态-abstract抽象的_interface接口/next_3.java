class next_3 {
	public static void main(String[] args) {
		cat a = new cat("小白",6);
			System.out.println(a.getName() + "," + a.getAge());
			a.eat();
			a.sleep();
		System.out.println("---------------------------------");
	catjump b = new catjump("小黑",3);
		System.out.println(b.getName() + "," + b.getAge());
			b.eat();
			b.sleep();
			b.jump();
	}
}
/*
案例演示:
动物类共性:姓名,年龄,吃饭,睡觉,
猫和狗.
动物培训接口:跳高.
*/
abstract class ainmal{
	private String name;
	private int age;
	public ainmal(){}
	public ainmal(String name,int age){
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
	public abstract void eat();
	public abstract void sleep();

}
class cat extends ainmal{
	public cat(){} 
	public cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void sleep(){
		System.out.println("站着睡");
	}

}
interface jumping{				//跳高
	public abstract void jump();	//接口中的方法必须是抽象类
}
class catjump extends cat implements jumping{
	public catjump(){}
	public catjump(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("跳高猫");
	}
}