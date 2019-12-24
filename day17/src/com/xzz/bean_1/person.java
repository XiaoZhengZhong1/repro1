package com.xzz.bean_1;

public class person implements Comparable<person> {  //表示实现比较接口,在person上Ctrl+1重写了Compareto方法
	private String name;
	private int age;
	
	public person() {
		super();
		
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;/*选31有三个原因.1:它是质数,能被自身和1整除.2:数字不大不小刚好,大了后面相乘会可能超出int的取值
		范围,小了,赋址范围容易重复.3:这个数好算,31是2的5次方-1,也就是2 >>>>>*/
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)		//表示对象一样,直接不要
			return true;		//返回true既不需要比较,也不需要新赋地址.
		if (obj == null)		//表示如果对象是空窜,也无需比较
			return false;		//返回false,结束
		if (getClass() != obj.getClass())	//表示如果都不是一个类的,
			return false;					//结束
		person other = (person) obj;		//向下强转
		if (age != other.age)				//如果本对象年龄和调用对象年龄不一样
			return false;					//结束
		if (name == null) {					//表示如果本对象名字是空窜,
			if (other.name != null)			//调用对象名字不是空窜.
				return false;				//结束
		} else if (!name.equals(other.name))	//另外,如果本对象名字不等于调用对象名字,
			return false;						//结束
		return true;	//以上条件如果都不满足,你能从头走到这.说明你的姓名和年龄和本对象是一样,可以调用equals方法
	}

/*//TreeSet添加自定义对象,输出,需要重新以下compareto比较对象顺序的方法,进行排序输出.
//1:重写的排序方法是按年龄排序	
	@Override
	public int compareTo(person o) {
		int num = this.age - o.age;	表示用本对象年龄-调用对象的年龄.系统默认返回值是0,就是只输出一个根对象,根对象就代表o
	然后后面的每个元素都会调用这个比较方法.和根age进行相减,比根大放左边,比根小放右边.相减是为了保证每次的返回值不一样,返回值一样
	就表示地址一样 ,就会当成重复的,不给输出.	
		return num == 0 ? this.name.compareTo(name) : num ;表示上面的结果num等于0吗,等于就比较姓名.因为String类
	实现了comparable接口,重新了compareTo方法,方法中显示字符串进行比较返回的是int值,就是说如果年龄相同相减为0,就比较姓名,姓名
	如果不同就会返回一个int值,返回这个值,只要不是0就不和根地址冲突,就能存进去.如果num结果不等于0.就直接返回num	
		
		1:当返回值是0,TreeSet对象输出一个元素,相当于是二叉树的树根,二叉数表示只有两个树杈,每次输出都会调用返回值,再和根的age比较
	比根大就放右边,比根小就放左边,如果左边或者右边有对象,就继续比较age,还是大的放右边,小的放左边.直到左边或者右边没有对象,输出的时候
	也是从左往右,当到右边时先看它左边有没有对象,有就先输出左边.2:当返回值大于0时,按顺序从上往下怎么存怎么取,3:当返回值是负数,则倒输出


	}*/
	/*
	//2:重写一个按姓名排序的方法
			@Override
			public int compareTo(person o) {
				int num = this.name.compareTo(o.name);
			return num == 0 ? this.age - o.age : num;
			}	*/

//3:重写一个按姓名长度排序的比较方法.
				@Override
				public int compareTo(person o) {
					int length = this.name.length() - o.name.length();	//表示比较姓名长度.
					int num = length == 0 ? this.name.compareTo(o.name) : length;	/*num等于三元运算结果
	表示如果上面比较姓名长度是一样的,就比较姓名内容,一样就返回0,不一样就返回length本身*/
					return num == 0 ? this.age - o.age : num;	/*表示num等于0吗,等于0就说明姓名长度和内容都一样.
					 那就比较年龄,如果年龄一样就返回0,如果不一样就返回年龄相减的值*/
				}	
}
