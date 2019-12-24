/*
#08.21_面向对象(final修饰变量的初始化时机)(掌握)
* A:final修饰变量的初始化时机
	* 显示初始化 
	* 在对象构造完毕前即可
	
*/
class Final {
	public static void main(String[] args) {
		//xxx d = new xxx();
	}
	


}
class xxx{
	//final int NUM = 10;//* 显示初始化 
		final int NUM;//如果不经过显示赋值,或者构造方法赋值,NUM是没有默认初始化值的,因为加了final,变成常量默认的int初始化值0无效
	public xxx(){
	NUM = 20;//在对象构造完毕前即可
	System.out.println(NUM);
	}
}