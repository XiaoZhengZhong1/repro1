package com.stringBuffer;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
/*##13.09_��������(�ַ�����ת)
* A:������ʾ
* 
		���󣺰��ַ�����ת
			����������¼��"abc"		
��������"cba"
	
��StringBuffer�Ĺ���ʵ��	
*/
//����1 ת���ͷ�ת
	Scanner sc = new Scanner(System.in);		//��������¼�����.
		String a = sc.nextLine();				//����¼�뵽string a ��.Line����¼���������͵�����.
	/*StringBuffer a1 = new StringBuffer(a);	//�ù��췽����Stringת����StringBuffer
		a1.reverse();							//StringBuffer ��ת����reverse()
	System.out.println(a1);
	sc.close();				*/					//��������¼��.

		
		
	
		
	System.out.println(reverseString(a));		//���÷�ת����.
	sc.close();									//��������¼��.
	}
//����2,��һ��ר�ŵķ���,�������ĺô��ǿ�����ȡ�����������Ŀ��Ҳ����.	
	public static String reverseString(String a){	//��ת����
		StringBuffer a2 = new StringBuffer(a);		//���췽��ת��
			a2.reverse();							//��תa2
				return a2.toString();				//����ת����string,��toStringת��.��a2
		
	}
	
	
	
	
	
}
