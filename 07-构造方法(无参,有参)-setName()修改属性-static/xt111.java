
/*
###07.07_�������(�����ΰ�����ϰ)(����)
* A:������ʾ
	* ����
		* ����һ����������,���� ���ܳ�������ķ�����
		* Ȼ����һ����������в��ԡ�
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
�밴���������. . .
*/
