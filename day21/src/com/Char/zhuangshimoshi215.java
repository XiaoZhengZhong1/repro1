package com.Char;

public class zhuangshimoshi215 {
/*###21.11_IO��(װ�����ģʽ)(���Ƕ���һ���ӿ�,�ӿڲ���ǿ.��Ҫһ��ǿ�����ȥʵ������ӿ�,���л��и�ǿ��ķ���.���ǿ��������װ��)
 * װ����Ƶĺô���,�����������,��Ϊװ����heima��ʵ���˱�װ����Coder.��ʵ�ֹ�ϵ,������Coder�ı���ı�.*/
	public static void main(String[] args) {
		student stu = new student();
				stu.cod();
		heima h = new heima(new student());	//��ʾ����һ��ѧ������.
			h.cod();
	}
}
interface Coder{  //�ô���Ľӿ�.
	public void cod();
}
class student implements Coder{	//ѧ��ʵ�����ô���ӿ�.��д���ô��뷽��.

	@Override
	public void cod() {
		System.out.println("java");		//ֻҪһ��java����,����ǿ��,���ʺ��ƹ�.
	System.out.println("----------------------------");
	}
	
}

class heima implements Coder{	//heimaҲʵ�����ô���ӿ�.
	private student s;			//��װ��ѧ�������,��ʾ�Ǳ����е�ѧ��.
	public heima(student s) {		//�вι���,����Ϊѧ�������.
		this.s = s;
	}

	@Override
	public void cod() {	//heima�����װ�����ģʽ.��ԭ�ӿڽ���ǿ����װ.��װ����ʺ��ƹ�.����ʵ�ֶ����Ǽ̳�,�����������.
		s.cod();
		System.out.println("javaEE");
		System.out.println("android");
		System.out.println("������");
	}
	
}