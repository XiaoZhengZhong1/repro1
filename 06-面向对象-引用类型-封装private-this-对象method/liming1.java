/*
* b:�������������Ϊʵ�ʲ�������
* C:������ʾ
	* ��������Ӧ�ó���
*/
/*class  liming1{
	public static void main(String[] args) {
		jiaju a = new jiaju();
		a.name = "ҡ��";
		a.colour = "��ɫ";
		a.yaohuang();
	    
		jiaju b = new jiaju();//��Ȼ��ͬ�����,������ͬ.��Ϊ��ͬ,����ÿ�������ǵ����ĸ���,Ҫnew,��Ȼ�м���������һ��new.���������Ҳֻ��һ��
		b.name = "ҡ��";
		b.colour = "��ɫ";
		b.yaohuang();
		
		jiaju c = new jiaju();
		c.name = "ҡ��";
		c.colour = "��ɫ";
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
//������Ҫ��������ͬ�����,��Ҫ�����ظ���д����,���븴����̫����.
//�������������ظ��Ķ���.����һ������method,��new�Ķ���ֱ�ӵ���method
/*class  liming1{
	public static void main(String[] args) {
		jiaju a = new jiaju();
			method(a);//�������õ�ʱ�����ڴ�����������
	    
		jiaju b = new jiaju();
			method(b);
		
		jiaju c = new jiaju();
			method(c);
	}
	public static void method(jiaju d){
			d.name = "ҡ��";
			d.colour = "��ɫ";
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
//�������������Ϊʵ�ʲ�������
class  liming1{
	public static void main(String[] args) {
		method(new jiaju());//new jiaju()�����һ���������,Ҳ����˵,����Ϊ��ֵ����,������Ǹ�����,�������ڷ�������,��ʾֱ�ӵ��÷���,��Ϊ����ͬ�����,������ͬ
	    method(new jiaju());
		method(new jiaju());
	}
	public static void method(jiaju d){
			d.name = "ҡ��";
			d.colour = "��ɫ";
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
/*�������θĶ�,��ߴ��븴����,�����������һ���Ľ��:
ҡ�� ��ɫ
ҡ�� ��ɫ
ҡ�� ��ɫ
�밴���������. . .
*/