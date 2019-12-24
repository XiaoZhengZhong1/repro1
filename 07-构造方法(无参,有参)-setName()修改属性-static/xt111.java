
/*
###07.07_面向对象(长方形案例练习)(掌握)
* A:案例演示
	* 需求：
		* 定义一个长方形类,定义 求周长和面积的方法，
		* 然后定义一个测试类进行测试。
*/

class xt111{
	public static void main(String[] agrs){
		Rectangle q = new Rectangle(5,8);
			System.out.println(q.getLength() + " " + q.getArea());
	}
	
}
class Rectangle{
	private int width;
	private int high;
	public Rectangle(){}
	public Rectangle(int width,int high){
		this.width = width;
		this.high = high;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	public void setHigh(){
		this.high = high;
	}
	public int getHigh(){
		return high;
	}
	public int getLength(){
		return (width + high) * 2;
	}
	public int getArea(){
		return width * high;
	}
}
/*
26 40
请按任意键继续. . .
*/
