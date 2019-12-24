package com.枚举2;

public  enum we3 {	//enum类枚举方式3:在enum类中有抽象方法.(注意虽然类中有抽象方法,但是类不用抽象)
	mo2("星期一"){	
		public void show(){
			System.out.println("星期一");
		}
	},tu2("星期二"){	//注意虽然是内部类但是,大括号后面的;和,不能同时存在 用enum中的逗号,格式.
		public void show(){
			System.out.println("星期二");
		}
	},we2("星期三"){
		public void show(){
			System.out.println("星期三");
		}
	};	

	private String name;
	private we3(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
