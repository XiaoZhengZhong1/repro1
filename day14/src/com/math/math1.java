package com.math;

public class math1 {

	public static void main(String[] args) {

/*###14.11_��������(Math������ͷ���ʹ��)
* A:Math�����
	* Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
* B:��Ա����
	* public static int abs(int a)------ȡ����ֵ��a=-10 ����������10.
	* public static double ceil(double a)-----ceil���컨����˼,����ȡ��ֵ����˼��a=10.1����ȡ��ֵ��������11.0
	* public static double floor(double a)-----floor�ǵذ����˼.����ȡ��ֵ����˼a=10.1����ȡ��ֵ��������10.0
	* public static int max(int a,int b)------- min��ѧ
	* public static double pow(double a,double b)
	* public static double random()
	* public static int round(float a) ����Ϊdouble����ѧ.
	* public static double sqrt(double a)
	*/
		Math.abs(-10);//------ȡ����ֵ��a=-10 ����������10.
		Math.ceil(10.1);//-----ceil���컨����˼,����ȡ��ֵ����˼��a=10.1����ȡ��ֵ��������11.0
		Math.floor(10.1);//-----floor�ǵذ����˼.����ȡ��ֵ����˼a=10.1����ȡ��ֵ��������10.0
		Math.max(10,20);//------- max��������˼.ȡ���ֵ.min����ȡ��Сֵ.
		Math.pow(2,3);//-----------2*2*2.2��3�η�����˼.��������8
System.out.println(Math.random());//------��ʾ�������0.0��0.1֮�������С��,��ͷ����β.0.45038833405627177

		Math.round(10.3);//------�����������˼ 
		Math.sqrt(2);//----------���ſ�ƽ������˼,
	
	
	
	
	}

}
