class next_3 {
	public static void main(String[] args) {
		cat a = new cat("С��",6);
			System.out.println(a.getName() + "," + a.getAge());
			a.eat();
			a.sleep();
		System.out.println("---------------------------------");
	catjump b = new catjump("С��",3);
		System.out.println(b.getName() + "," + b.getAge());
			b.eat();
			b.sleep();
			b.jump();
	}
}
/*
������ʾ:
�����๲��:����,����,�Է�,˯��,
è�͹�.
������ѵ�ӿ�:����.
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
		System.out.println("è����");
	}
	public void sleep(){
		System.out.println("վ��˯");
	}

}
interface jumping{				//����
	public abstract void jump();	//�ӿ��еķ��������ǳ�����
}
class catjump extends cat implements jumping{
	public catjump(){}
	public catjump(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("����è");
	}
}