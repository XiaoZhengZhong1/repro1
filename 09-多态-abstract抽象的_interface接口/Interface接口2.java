class Interface接口2 {
	public static void main(String[] args) {
		son a = new son();
			a.print();
		System.out.println(father.n);//能用类来调用,说明 n 加了静态 static  输出值没有被下面n=20改变,说明加了final  所有接口都是公开的,所以有public
	}
}
/*
1:接口的成员特点?
	成员变量,只能是常量.并且是静态的,公共的.
		默认格式:public static final------意思是公共的最终常量.建议手动给出.---默认就是即使你没写系统也会自加加上去,不在代码中显示出来,三个关键字可以换位置

	构造方法?
		接口没有构造方法.
	成员方法?
		只能是抽象方法,默认格式:public abstract    建议手动给出.    
总结:接口中所有的,成员变量,成员方法,都是公共的.系统都会默认加上public 和 statis 和 final 和 abstract 这些关键字
*/
interface father{
         int n = 10;					//此行和下行代码是一个意思,下行前面的public static final是系统默认加上的,没有显示出来
	//public static final int n = 10;	//public static final这三个关键字都是修饰成员变量的,可以互换位置,不会报错
	//public father(){}//此行报错,因为接口中没有构造方法
//	void print();//此行没报错,说明它是抽象类的方法,因为它没有大括号,系统默认在前面加了public abstract 
	public abstract void print();//此行代码和上行代码是一样的,上行是简写的,
}
class son implements father{
	public void print(){
		int n = 20;
		System.out.println(n);
	}
	
}
/*
20
10
请按任意键继续. . .
*/
