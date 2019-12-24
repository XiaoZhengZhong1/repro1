/*
###07.10_面向对象(static关键字的特点)(掌握)
* A:static关键字的特点
	* a:随着类的加载而加载
	* b:优先于对象存在---就是new对象还没出来之前,基本类class文件生成时stati
	* c:被类的所有对象共享
		
		
		* 举例：咱们班级的学生应该共用同一个班级编号。
		* 其实这个特点也是在告诉我们什么时候使用静态?
			* 如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
		* 举例：
			* 饮水机(用静态修饰)
			* 水杯(不能用静态修饰)
			* 共性用静态,特性用非静态
	
	
	* d:可以通过类名调用
		* 其实它本身也可以通过对象名调用。
		* 推荐使用类名调用。
		* 静态修饰的内容一般我们称其为：与类相关的，类成员
* B:案例演示
	* static关键字的特点
*/
//共性(共用的)用静态,特性(私有的)用非静态.
//加了静态static后可以通过 类名 . 和 对象 . 来获取和打印加了静态的类容,
//建议用 类名 . 不用创建对象,节省内存.
//静态成员变量叫类变量,静态成员方法叫类方法
class  Static
{
	public static void main(String[] args) 
	{		people.nationality = "中国";
		System.out.println(people.nationality);
	}
}
class people{
	String name;
	int age;
	static String  nationality;
}