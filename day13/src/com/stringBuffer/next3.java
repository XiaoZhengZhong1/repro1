package com.stringBuffer;

public class next3 {

	public static void main(String[] args) {
/*##13.23_��������(Integer��������)
* A:Integer��������
* 
		������д���*/
				
	Integer i1 = new Integer(97);
	Integer i2 = new Integer(97);
	System.out.println(i1 == i2);//fase,�Ƚϵ�ַ,����new�����Ķ����ַ�϶���һ��
	System.out.println(i1.equals(i2));//ture,ֵһ��
	System.out.println("-----------");

	Integer i3 = new Integer(197);
	Integer i4 = new Integer(197);
	System.out.println(i3 == i4);//ͬ��
	System.out.println(i3.equals(i4));//ͬ��
	System.out.println("-----------");

	Integer i5 = 97;
	Integer i6 = 97;
	System.out.println(i5 == i6);//ture �Զ�װ��һ����ֵ�϶���һ����ַ��,
	System.out.println(i5.equals(i6));//ͬ��
	System.out.println("-----------");

	Integer i7 = 197;
	Integer i8 = 197;
	System.out.println(i7 == i8);//fase ��Ϊ==�űȽϵĵ�ַ����byte�ֽ���ȡֵ��Χ��,��-127��128ֱ��,������Χ,Ҫnew����
	System.out.println(i7.equals(i8));//ͬ��


	
	
	
	
	}

}
