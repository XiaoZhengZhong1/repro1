//多态成员方法编译运行特点练习:动态绑定,编译看左边,运行看右边.
class  xt1{
	public static void main(String[] args) {
		
		ainmal a = new cat();
			a.function();
		cat b = new dog();		
			b.function();
	}
}
class ainmal{
	public void eat(){
		function();
	}
	public void function(){
		System.out.println("很多功能");
	}
}


class cat extends ainmal{
	public void function(){
		System.out.println("猫抓老鼠");
	}
}
class dog extends cat{
	public void function(){
		System.out.println("狗看门");
	}
}
/*
猫抓老鼠
狗看门
请按任意键继续. . .


*/