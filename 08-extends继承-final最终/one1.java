/*
A:������ʾ
	* ʹ�ü̳�ǰ��ѧ������ʦ����
	* ����:����,����
	* ��Ϊ:�Է�
	* ��ʦ�����еķ���:����
	* ѧ�������еķ���:ѧϰ
*/

class one1 {
	public static void main(String[] args) {
		Teather q = new Teather("Ф��ʦ",31);
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
		System.out.println(name + "�Է�");
	}
}
class Teather extends person{
	public Teather(){}
	public Teather(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println(super.getName() + "�Է�");
	}
	public void teach(){
		System.out.println(super.getName() + "����");
	}
}
class student extends person{
	public student(){}
	public student(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println(super.getName() + "�Է�");
	}
	public void study(){
		System.out.println(super.getName() + "ѧϰ");
	}

}
/*
Ф��ʦ, 31
Ф��ʦ�Է�
Ф��ʦ����
-------------------
xzz, 31
xzz�Է�
xzzѧϰ
�밴���������. . .
*/