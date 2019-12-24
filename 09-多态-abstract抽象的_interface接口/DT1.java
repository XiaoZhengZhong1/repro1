/*09--02
多态中的成员访问特点之成员变量:编译看左边.运行看左边,   比喻father a = new son()
*/

class  DT1{
	public static void main(String[] args) {
		father a = new son();
		System.out.println(a.NUM);//输出结果 10 因为new son()虽然是子类对象,但继承了父类,所有新键对象会默认访问父类对象.得到值10 编译看左边,运行看左边,
								  // //new子类对象把地址赋值给了父类,所有输出10
		son b = new son();
		System.out.println(b.NUM);//输出结果20
	
	}							 
}
class father{
	int NUM = 10;
}
class son extends father{
	int NUM = 20;
}

