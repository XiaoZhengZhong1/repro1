package com.demo.string;

public class demo4_string {

	public static void main(String[] args) {
//1:String���滻����,��ʽ:String ������ = ������.replace(char '�ɵ�',char '�µ�')		�����ַ��滻.
	/*	String a = "helloWord";
		String a1 = a.replace('e', 'h');	//�����ַ��滻.
				System.out.println(a1);*/
//:String���滻����,��ʽ:String ������ = ������.replace(String "�ɵ�",String "�µ�")		����ַ�,�ַ������滻.
		/*String b = "helloWord";
		String b1 = b.replace("hell", "abcd");	//����ַ�,�ַ������滻.
			System.out.println(b1);*/

		//2:Stringȥ���ո񷽷�,trim(); 
	String c = "  helloword    ";
	String c1 = c.trim();	//��ȥ��ǰ��Ŀո�,����������ȥ����������֮���,���׷��ֵĿո�.
	System.out.println(c1);//��ȥ��ǰ��Ŀո�,����������ȥ����������֮���,���׷��ֵĿո�.c.trim()
	

	}

}
