/*
* b:匿名对象可以作为实际参数传递
* C:案例演示
	* 匿名对象应用场景
*/
/*class  liming1{
	public static void main(String[] args) {
		jiaju a = new jiaju();
		a.name = "摇椅";
		a.colour = "红色";
		a.yaohuang();
	    
		jiaju b = new jiaju();//虽然是同类对象,属性相同.行为相同,但是每个对象都是单独的个体,要new,虽然有几个对象共用一个new.最终输出的也只有一个
		b.name = "摇椅";
		b.colour = "红色";
		b.yaohuang();
		
		jiaju c = new jiaju();
		c.name = "摇椅";
		c.colour = "红色";
		c.yaohuang();

	}
}
class jiaju{
	String name;
	String colour;
public void yaohuang(){
	System.out.println(name + " " + colour);
}

}*/
//上面想要创建三个同类对象,需要三次重复编写调用,代码复用性太低了.
//下面外面把这个重复的对象.做成一个方法method,新new的对象直接调用method
/*class  liming1{
	public static void main(String[] args) {
		jiaju a = new jiaju();
			method(a);//方法调用的时候不用在传递数据类型
	    
		jiaju b = new jiaju();
			method(b);
		
		jiaju c = new jiaju();
			method(c);
	}
	public static void method(jiaju d){
			d.name = "摇椅";
			d.colour = "红色";
			d.yaohuang();
	}
}
class jiaju{
	String name;
	String colour;
public void yaohuang(){
	System.out.println(name + " " + colour);
}

}*/
//匿名对象可以作为实际参数传递
class  liming1{
	public static void main(String[] args) {
		method(new jiaju());//new jiaju()这就是一个里面对象,也可以说,它因为赋值对象,本身就是给对象,把它放在方法里面,表示直接调用方法,因为都是同类对象,属性相同
	    method(new jiaju());
		method(new jiaju());
	}
	public static void method(jiaju d){
			d.name = "摇椅";
			d.colour = "红色";
			d.yaohuang();
	}
}
class jiaju{
	String name;
	String colour;
public void yaohuang(){
	System.out.println(name + " " + colour);
}

}
/*上面三次改动,提高代码复用性,都是输出下面一样的结果:
摇椅 红色
摇椅 红色
摇椅 红色
请按任意键继续. . .
*/