package com.other_io;

import java.io.PrintStream;

import com.person.person;

public class Z_System_out_225 {
/*###22.09_IO��(��ӡ���ĸ������ص�)(����)
* 1.ʲô�Ǵ�ӡ��----PrintStream��һ������ʵ��io������,��һ����ӡ������
	*�������Ժܷ���Ľ������toString()������, �����Զ����ϻ���, ���ҿ���ʹ���Զ�ˢ����ģʽ
	* System.out�������ؾ���һ��PrintStream(��ӡ��), ��Ĭ�������̨�����Ϣ
	* PrintStream ��ӡ�������ַ���ʹ��ƽ̨��Ĭ���ַ�����ת��Ϊ�ֽڡ�����Ҫд���ַ�������д���ֽڵ�����£�Ӧ��ʹ�� PrintWriter �ࡣ */
	public static void main(String[] args) {
		System.out.println("a");	//����������Ϥ�Ĵ�ӡ�����ʽ.
		//��ʾ���������ӡ��ʽ.
		PrintStream ps = System.out;	/*��ȡ��׼�����.API��ʾout��System���е�static�ֶ�,ֻ�����������.����
		System.out, out�ֶ��Ǳ�׼���������˼,�����ֶη��ص���PrintStream���͵�ֵ.*/
			ps.println(97);	//Run=97 �൱�ڰ�97�����ַ������.��Ϊ�ײ�(ԭ����)��Integer.toString()��97ת�����ַ�����.
			ps.write(97);;	//Run= a �ײ�����˱����,�鵽д���97��Ӧ��a
			
			person p1 = new person("xialei",2);
			ps.println(p1);	/*Run=person [name=xialei, age=2] ˵���ô�ӡ����ӡ������������.���������null�͵���
			�����е�toString����.*/
			person p2 = null;
			ps.println(p2);	//Run=null ˵���������ֵλnull.�����null.
			ps.close();		
	}
/*2.ʹ�÷�ʽ
* ��ӡ: print(), println()
* �Զ�ˢ��: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
* ��ӡ��ֻ��������Ŀ��*/
}
