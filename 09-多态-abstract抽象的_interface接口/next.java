class next {
	public static void main(String[] args) {
		teather a = new teather("Ф��ʦ",31);
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
����,��ʦѧ��
����:����.����.�Է�
����.��ʦ����,
����:ѧ��ѧϰ.
����:�������������������һ������.����
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
		System.out.println("�Է�");
	}
	public abstract void function();

}
class teather extends person{
	public teather(){}
	public teather(String name,int age){
		super(name,age);
	}
	public void function(){
		System.out.println("��ʦ����");
	}

}
class student extends person{
	public student(){}
	public student(String name,int age){
		super(name,age);
	}
	public void function(){
		System.out.println("ѧ��ѧϰ");
	}	
}
/*
Ф��ʦ,31
��ʦ����
xzz,18
ѧ��ѧϰ
�밴���������. . .
*/
