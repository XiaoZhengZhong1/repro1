package com.stringBuffer;

public class demo8_integet {

	public static void main(String[] args) {
/*
###13.19_��������(�������Ͱ�װ��ĸ���)
* A:Ϊʲô���л������Ͱ�װ��
	* �������������ͷ�װ�ɶ���ĺô����ڿ����ڶ����ж������Ĺ��ܷ������������ݡ�
* B:���ò���
	* ���õĲ���֮һ�����ڻ��������������ַ���֮���ת����
* C:�������ͺͰ�װ��Ķ�Ӧ
* 
		byte 			Byte
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double
		char			Character
		boolean			Boolean*/
	System.out.println(Integer.MAX_VALUE);//����.����int�����������ȡֵ��Χ�ķ���
	System.out.println(Integer.MIN_VALUE);//����.����int����������Сȡֵ��Χ�ķ���
	
//intת����string.����1:��int +""����.  ����2:��string.valueOf(int);����ֵת������.���������.���б�ķ����Ͳ�˵��.
	int a = 100;
	String a1 = a + "";
	System.out.println(a1);
	
	String a2 = String.valueOf(a);
	System.out.println(a2);
	
	
/*stringת����int.��parse.��parseInt(),���������þ���int.parseInt();��������������,����char����֮��,
����7�ֻ�����������,��װ��,���涼��parse();����.��Ϊchar���ַ�,ֻ�ܴ浥���ַ�,������ת�������治��.תchar��toCharArray();	

*/	
//parse();����.�������÷���
	String b = "abc";
	int b1 = Integer.parseInt(b);	//����int��װ��Integer���������parse()�������ַ���bת����int,����parseInt(b);
	System.out.println(b1);
	
	String b2 = "ture";
	boolean b3 = Boolean.parseBoolean(b2);	//���ַ���ת����boolean��
	System.out.println(b3);
	}
	/*###13.20_��������(Integer��ĸ����͹��췽��)
	* A:Integer�����
		* ͨ��JDK�ṩ��API���鿴Integer���˵��

		* Integer ���ڶ����а�װ��һ���������� int ��ֵ,
		* �����ṩ�˶������������ int ���ͺ� String ����֮�以��ת����
		* ���ṩ�˴��� int ����ʱ�ǳ����õ�����һЩ�����ͷ���
	* B:���췽��
		* public Integer(int value)
		* public Integer(String s)
	* C:������ʾ
		* ʹ�ù��췽����������
*/
}
