package com.枚举;

public abstract class week3 {	//创建枚举类方式3:在枚举类中有一个抽象方法.
	public static final week3 mon3 = new week3("星期一"){/*因为类中有抽象方法,所以类必须是抽象的,抽象类是不能实例化的是不能
	new的,但是可以通过匿名内部类(就是new一个匿名子类对象,重写抽象方法.new week3("星期一")代表一个子类,通过有参构造创建的匿名子类
	后面的{};大括号和分号代表一个完整的类格式,因为的内部类所以要加分号*/
		public void show(){
			System.out.println("星期一");
		}
	};
	public static final week3 tue3 = new week3("星期二"){
		public void show(){
			System.out.println("星期二");
		}
	};
	public static final week3 wed3 = new week3("星期三"){
		public void show(){
			System.out.println("星期三");
		}
	};

	private String name;
	private week3(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
	
	}
