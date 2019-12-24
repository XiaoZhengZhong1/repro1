class  xt{
	public static void main(String[] args) {
		shu a = new shu();
		a.name = "松树";
		a.age = 50;
		System.out.println(a.name + " " + a.age);
		a.cz();//方法调用放在成员变量,输出语句下面,才能按顺序依次输出
		shu a1 = new shu();	//同一类,可以new很多个对象.对象名不能重复
		a1.name = "红木";	//成员变量可以更改
		a1.age = 100;
	System.out.println(a1.name + " " + a1.age);
		a1.hm();//成员方法可以不同
       shu a2 = a1;	//表示另一个对象a2和a1一样
		a2.hm();	//表示成员方法也一样.调用就会输出,成员变量也一样.这叫三个引用,两个对象(new)
	}
}
class shu{
	String name;//同一类,成员变量(属性)只需定义一次,
	int age;
public void cz(){
	System.out.println("松树能成长.大松树能做白木家具");
}
public void hm(){
	System.out.println("红木能成长.百年红木才能做红木家具");
	}
/*
松树 50
松树能成长.大松树能做白木家具
红木 100
红木能成长.百年红木才能做红木家具
*/
}