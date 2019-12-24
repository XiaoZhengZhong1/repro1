/*

###06.13_面向对象(封装的概述)(掌握)
* A:封装概述
	* 是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。

* B:封装好处
	* 隐藏实现细节，提供公共的访问方式
	* 提高了代码的复用性
	* 提高安全性。
* C:封装原则
	* 将不需要对外提供的内容都隐藏起来。
	* 把属性隐藏，提供公共方法对其访问。
*/
/*
###06.14_面向对象(private关键字的概述和特点)(掌握)
* A:人类赋值年龄的问题
* B:private关键字特点
	* a:是一个权限修饰符
	* b:可以修饰成员变量和成员方法
	* c:被其修饰的成员只能在本类中被访问
* C:案例演示
	* 封装和private的应用：
	* A:把成员变量用private修饰
	* B:提供对应的getXxx()和setXxx()方法
	* private仅仅是封装的一种体现形式,不能说封装就是私有
*///这是刚学过的创建对象
/*class  Lprivate{
	public static void main(String[] args) {
		glass a = new glass();
			  a.name = "玻璃杯";
			  a.g =  200;
			a.zhuangshui();
		
	}
}
class glass{
	String name;
	int g;
public void zhuangshui(){
	System.out.println(name + " " +"重量" + g + "g" + " " + "能装水");
}
}
*/

//现在,把上面的代码拿下来进行private封装
//封装后提高安全性,比喻下面如果glass(杯子)类中,如果重量出现了负数-11,就会有提醒语句("对不起,您的输入有误")
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setN("玻璃杯");
			  a.setK(11);
			 a.zhuangshui();
		
	}
}
class glass{
	private String name;
	private int Kg;
	public void setK(int b){//此行代码,由于把void写成int,(编译出现,错误: 缺少返回语句),找了1个多小时,才发现.set设置局部变量,是不需要返回值的,所以是void空白
		if (b > 0 && b < 1000){
		Kg = b;
		}else {System.out.println("对不起,您的输入有误");}

	}
		public void setN(String n){
			name = n;	
		}
		public String getN(){
		return name;
	
		}
	public int getK(){
		return Kg;
	
	}
	public void zhuangshui(){
		System.out.println(name + " " +"重量" + Kg + "g" + " " + "能装水");
	}

}*/

//由于上面 b k  n N 变量太多,不方便浏览,下面把这些变量,都改回,是name就都用name,是kg就都用kg,
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("玻璃杯");//这里已经调用赋值了名字和重量.为什么下面输出系统默认值unll 0,说明赋值没有进到封装了name和kg中
			  a.setKg(11);
			 a.zhuangshui();
	}
}
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){	// 局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则。
		if (kg > 0 && kg < 1000){
			kg = kg;
		}else {System.out.println("对不起,您的输入有误");}

	}
	public void setName(String name){//因为就近原则,所以系统默认给就近的方法调用中的name和kg赋值,而成员变量没有赋值.所以输出的是null和0
		name = name;	
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
	public void zhuangshui(){
		System.out.println(name + " " +"重量" + kg + "g" + " " + "能装水");
	}*/
/*输出结果如下:
null 重量0g 能装水
请按任意键继续. . .
*/
//}
/*
#06.15_面向对象(this关键字的概述和应用)(掌握)
* A:this关键字特点
	* 代表当前对象的引用,代表的是成员变量. 
* B:案例演示
	* this的应用场景
	* 用来区分成员变量和局部变量重名
*/
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("玻璃杯");
			  a.setKg(11);
			 a.zhuangshui();
	//System.out.println(a.getName() + " " +"重量" +a.getKg() + "g" + " " + "能装水");//注意:如果要在测试类输出打印,就要 对象名.方法名()
						
					//注意:getkg(),不仅可以打印,还可以获取值,也可以赋值给其它变量,用作其他操作,方法语句体中的输出语句只能打印显示
	}
}
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){
		if (kg > 0 && kg < 1000){
			this.kg = kg;	//代表当前对象的引用,当前对象就是 a ,只有一个对象所以name和kg都代表是这个对象的
		}else {System.out.println("对不起,您的输入有误");}

	}
	public void setName(String name){
		this.name = name;	//this用来区分成员变量和局部变量重名
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
	public void zhuangshui(){
		System.out.println(name + " " +"重量" + kg + "g" + " " + "能装水");//在基本类里输出打印,直接输入name和kg 就可以;因为基本类就是对象类
	}
}
/*加了两个this后.输出结果如下:
玻璃杯 重量11g 能装水
请按任意键继续. . .

*/
//下面两个对象输出.只用了一次,this,说明this只代表当前对象,你输出a对象this就代表a对象,你输出a2对象this就代表a2
/*class  Lprivate {
	public static void main(String[] args) {
		glass a = new glass();
			  a.setName("玻璃杯");
			  a.setKg(11);
			System.out.println(a.getName() + " " +"重量" +a.getKg() + "g" + " " + "能装水");
		glass a2 = new glass();  
			   a2.setName("白钢杯");
			   a2.setKg(222);
			System.out.println(a2.getName() + " " +"重量" +a2.getKg() + "g" + " " + "能装水");
	}
}							
class glass{
	private String name;
		private int kg;
	public void setKg(int kg){
		if (kg > 0 && kg < 1000){
			this.kg = kg;	
		}else {System.out.println("对不起,您的输入有误");}

	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;
	}
	public int getKg(){
		return kg;
	}
/*输出结果
玻璃杯 重量11g 能装水
白钢杯 重量222g 能装水
请按任意键继续. . .*/



//}