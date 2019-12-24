package com.枚举;

public class week2 {	//创建枚举类方式2:用有参构造在本类创建对象.
	public static final week2 mon2 = new week2("星期一");
	public static final week2 tue2 = new week2("星期二");
	public static final week2 wed2 = new week2("星期三");

	private String name;
	private week2(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	
}
