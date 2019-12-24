/*
###07.01_面向对象(构造方法Constructor概述和格式)(掌握)
* A:构造方法概述和作用
	* 给对象的数据(属性)进行初始化
* B:构造方法格式特点
	* a:方法名与类名相同(大小也要与类名一致)
	* b:没有返回值类型，连void都没有
	* c:没有具体的返回值return;
*/
//演示证明使用构造方法,创建对象后,不用调用方法就能输出构造方法的语句体
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
	}
}
class diban{
	private String name;
	private int price;
	public diban(){		//构造方法
		name = "红木地板";
		price = 50;
		System.out.println(name + " " + price);
	}
}
*/
/*
红木地板 50
请按任意键继续. . ..
*/




/*
#07.02_面向对象(构造方法的重载及注意事项)(掌握)
* A:案例演示
	* 构造方法的重载
	* 重载:方法名相同,与返回值类型无关(构造方法没有返回值),只看参数列表
* B:构造方法注意事项
	* a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
	* b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		* 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
*/
//没有给出构造方法，系统将自动提供一个无参构造方法。
//下面代码没有对象赋值的方法,最后系统输出的结果 null 0 ,就是系统给出的无参构造方法public diban(){},方法,名和类名相同.后面小括号是空的.叫无参
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
			p.pudi();
	}
}
class diban{
	private String name;
	private int price;
	public void pudi(){
		System.out.println(name + " " + price);
	}
}
*/
/*
null 0
请按任意键继续. . .
*/
/*




*/
//无参构造和有参构造.因为构造的格式是;方法名和类名相同.一个有参数,一个没有参数,方法相同.参数不同,叫重载.
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
		diban p2 = new diban("花梨木",88);		
	}
}
class diban{
	private String name;
	private int price;
	public diban(){									//空小括号,无参构造
		System.out.println(name + " " + price);
	}
	public diban(String name,int price){			//小括号里面有参数.叫有参构造
				this.name = name;
				this.price = price;
		System.out.println(name + " " + price);
	}
		
}		//输出结果无参的由系统给默认值,有参的,输出赋值结果,有参的好处,能给对象属性(成员变量)初始化赋值,
*/
/*
null 0
花梨木 88
请按任意键继续. . .
*/



/*
#07.03_面向对象(给成员变量赋值的两种方式的区别)
* A:setXxx()方法
	* 修改属性值 
* B:构造方法
	* 给对象中属性进行初始化 
*/
//:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
class  yi{
	public static void main(String[] args) {
		diban p = new diban("花梨木",88);		
			  p = new diban("红酸枝",999);	//在构造方法中改属性,等于新键了一个对象,把原对象变成垃圾了,不建议这样使用		
		System.out.println(p.getName()+ " " + p.getPrice());
/*
红酸枝 999
请按任意键继续. . ..
*/
		diban p2 = new diban();	//因为这无参构造没有参数,我们就调用set里的参数
			p2.setName("楠木");
			p2.setPrice(66);
		System.out.println(p2.getName()+ " " + p2.getPrice());
/*
花梨木 88
楠木 66
请按任意键继续. . .
*/
			p2.setName("红豆杉");	//setXxx()方法,修改属性值,方便安全.在开发中用它修改的时候,多些.修改后,原名还在. 
			p2.setPrice(77);
	System.out.println(p2.getName()+ " " + p2.getPrice());
/*
花梨木 88
楠木 66
红豆杉 77
请按任意键继续. . .
*/	
	}
}
class diban{
	private String name;
	private int price;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public diban(String name,int price){			
				this.name = name;
				this.price = price;
		
	}
	public diban(){
	
	}	
}	