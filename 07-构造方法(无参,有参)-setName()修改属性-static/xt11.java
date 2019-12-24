/*
###07.05_面向对象(手机类的代码及测试)(掌握)
* A:案例演示
	* 模仿学生类，完成手机类代码
*/

class xt11{
	public static void main(String[] args){
		phone h = new phone("xiaomi",666);
			System.out.println(h.getName() + " " + h.getPrice());
		phone h2 = new phone();
			h2.setName("honor");
			h2.setPrice(1688);
			h2.show();
	}
}
class phone{
	private String name;
	private int price;
	public phone(){}
	public phone(String name,int price){
		this.name = name;
		this.price = price;
	}
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
	public void show(){
		System.out.println(name + "" + price);
	}
}

/*
xiaomi 666
honor1688
请按任意键继续. . .
*/