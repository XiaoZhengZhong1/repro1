package com.枚举2;

public enum we2 {	//enum类枚举方式2:通过有参构造声明实体对象.
	mo2("星期一"),tu2("星期二"),we2("星期三");

	private String name;
	private we2(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
