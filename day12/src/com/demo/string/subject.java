package com.demo.string;

public class subject {

	public static void main(String[] args) {
/*//������?�ʽ����ture����false ��:��������ture
		String f = "abc";	//�����������ص��ص���,��ֵǰ�ȿ���������û�ж�Ӧ��ֵ,�о�֮����,û�оʹ���,
		String f1 = "abc";	//��Ϊ�����Ѿ�������abc,���Ը�f1��ֵʱ��ֱ����,��ͬһ����ַ
		System.out.println(f == f1);	//��˼��f��f1�ĵ�ֵַ�����?
		System.out.println(f.equals(f1));	//��˼��f��f1��ֵ�����?
*/
//������2:�����洴���˼��μ̳ж���. ��:����,������һ��,���ڴ�һ��.���ֵ�ĵ�ַ�Ƕ��ڴ��.
		//String g = new String("abc");
	
//������3:�ʽ��?
	/*String h = new String("abc");	//h����ֵ�ĵ�ַ��new�Ķ��ڴ��ַ.
	String	h1 = "abc"; 			//h1����ֵ�ĵ�ַ�Ƿ������ĳ�������ַ.
		System.out.println(h == h1);	//false
		System.out.println(h.equals(h1));	//true
*/		
//������4:�ʽ��?
	/*	String b = "a" + "b" + "c";			//b = 1 + 2 + 3
		String b1 = "abc";					//b1 = 6
	System.out.println(b == b1);	//�����true,��Ϊjava���г����Ż�����,����������ʾһ��,������������b=6,�ٰ�b�ĵ�ַ��b1
	System.out.println(b.equals(b1));//�����ture,��Ϊ�ֿ��ʹ���һ��Ľ����һ����
	*/
	
//������5:�ʽ��?
	String a = "ab";
	String a2 = "abc";
	String a3 = a + "c";
	System.out.println(a2 == a3);	//�����false��Ϊa3=a+"c";�Ӻ����ַ����������ڶ��ڴ�����Ӻ�ת�����ַ�����ַ,�Ƕ��ڴ��ַ.
	System.out.println(a2.equals(a3));//�����true,��Ϊ���ս����һ��.
	
	
	}

}
