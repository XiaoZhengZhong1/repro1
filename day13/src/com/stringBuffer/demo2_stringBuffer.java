package com.stringBuffer;

public class demo2_stringBuffer {

	public static void main(String[] args) {
/*##13.03_��������(StringBuffer����ӹ���)
* A:StringBuffer����ӹ���
* public StringBuffer append(String str):
  ���԰���������������ӵ��ַ�������������,�������ַ�������������
 public StringBuffer insert(int offset,String str):
 ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������*/

	StringBuffer a = new StringBuffer();
	System.out.println(a);//������Ϊ��.˵����д��toString����,��Ȼ���������� ��ֵַ
	System.out.println(a.toString());//������Ϊ��
	//���԰���������������ӵ��ַ�������������,�������ַ�������������:append(String str):
	//�����¼��Ķ��� a ��һ���ղι���,����ֱ����������,int Boolean string char ���͵�ֵ,����4������ָ��һ������.
	//StringBuffer���ַ�������,��new��ʱ�����ڶ��ڴ��д�����һ������,�ռ�ײ���һ������Ϊ16���ַ�����,��������ӷ���ʱ,�����ٴ���
	//����,�ڲ��ϵ��򻺳�������ַ�
	StringBuffer a1 = a.append(100);
	StringBuffer a2 = a.append(true);
	StringBuffer a3 = a.append("xzz");
	StringBuffer a4 = a.append('d');
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	//��������ʾ�����������һ��,������� 100truexzzd ֤��4������ָ��һ������,�����������Ԫ�صı�����һ��new�ռ���.
	
	//public StringBuffer insert(int offset,String str):
	//��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
	StringBuffer b = new StringBuffer("helloword");
		 b.insert(3, "xzz");//��ʾ��b�����,��3������λ�����xzz
		 System.out.println(b);	//������:helxzzloword
	
	
//append����ͷ����β�������.     insert����ָ��λ�ý��в���.	
	
	}

}
