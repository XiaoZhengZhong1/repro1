/*
##07.04_面向对象(学生类的代码及测试)(掌握)
* A:案例演示
	* 学生类：
		* 成员变量：
			* name，age
		* 构造方法：
			* 无参，带两个参
		* 成员方法：
			* getXxx()/setXxx()
			* show()：输出该类的所有成员变量值
* B:给成员变量赋值：
	* a:setXxx()方法
	* b:构造方法
	
* C:输出成员变量值的方式：
	* a:通过getXxx()分别获取然后拼接
	* b:通过调用show()方法搞定
*/

class xt1 {
	public static void main(String[] args) {
		student t = new student("xzz",31);
		System.out.println(t.getName() + " " + t.getAge());
		student t2 = new student();
			t2.setName("XL");
			t2.setAge(2);
			t2.show();
	}
}
class student{
	private String name;
	private int age;
	public student(){}
	public student(String name,int age){
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
	public void show(){
		System.out.println("姓名:" + name + ",年龄:" + age);
	
	}
}	

/*
xzz 31
姓名:XL,年龄:2
请按任意键继续. . .
*/






