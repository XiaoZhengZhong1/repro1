class next3 {
	public static void main(String[] args) {
		A q = new A();
			q.method();
	}
}
/*

###10.13_面向对象(匿名内部类的格式和理解)
* A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
* 
		new 类名或者接口名(){
			重写方法(){}
		
		};		//整个new代表是继承的子对象,包括里面的方法和输出语句,所以在,两个大括号,第二给大括号外面要加上;分号,表示整个子类对象结束
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
*/
abstract class father{	//抽象类
	public abstract void eat();
}
class A {
	class B extends father{
		public void eat(){}
		public void method(){
		new father(){
			public void eat(){
				System.out.println("吃");
			}
		}.eat();
	
		}
	}
}