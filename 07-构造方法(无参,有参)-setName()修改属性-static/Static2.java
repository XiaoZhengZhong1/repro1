/*
###07.11_面向对象(static的注意事项)(掌握)
* A:static的注意事项
	* a:在静态方法中是没有this关键字的----因为对象方法是不需要写static,写了static就代表不是对象方法,this只代表当前对象.所有写了static就没有this
		* 如何理解呢?
			* 静态是随着类的加载而加载，this是随着对象的创建而存在。
			* 静态比对象先存在。
	* b:静态方法只能访问静态的成员变量和静态的成员方法
		* 静态方法：
			* 成员变量：只能访问静态变量
			* 成员方法：只能访问静态成员方法
		* 非静态方法：
			* 成员变量：可以是静态的，也可以是非静态的
			* 成员方法：可是是静态的成员方法，也可以是非静态的成员方法。
			
			
			
			
			* 简单记：
			* 静态只能访问静态。
*/
//下面静态方法可以通过 类名 . 方法名 调用,非静态方法只能通过,创建对象后,对象 . 方法 调用
class  Static2{
	public static void main(String[] args) {	
		  people.print1();
		people g = new people();
			g.print2();			
	}
}
class people{
	String name = "xzz";
	static int age = 31;
	public static void print1(){	//静态打印方法
		//System.out.println(name);	//此行错误: 无法从静态上下文中引用非静态 变量 name
		System.out.println(age);	//上行注释后,输出结果 31,   说明静态只能访问静态
	}
	public void print2(){			//非静态打印方法
		System.out.println(name);
		System.out.println(age);	//上面对象.方法 调用后能输出静态age, 说明非静态即能访问非静态也能访问静态
	}
}
/*
31
xzz
31
请按任意键继续. . .
*/
/*
###07.12_面向对象(静态变量和成员变量的区别)(掌握)
* 静态变量也叫类变量  成员变量也叫对象变量
* A:所属不同
	* 静态变量属于类，所以也称为为类变量
	* 成员变量属于对象，所以也称为实例变量(对象变量)
* B:内存中位置不同
	* 静态变量存储于方法区的静态区
	* 成员变量存储于堆内存
* C:内存出现时间不同
	* 静态变量随着类的加载而加载，随着类的消失而消失
	* 成员变量随着对象的创建而存在，随着对象的消失而消失
* D:调用不同
	* 静态变量可以通过类名调用，也可以通过对象调用
	* 成员变量只能通过对 象名调用
*/